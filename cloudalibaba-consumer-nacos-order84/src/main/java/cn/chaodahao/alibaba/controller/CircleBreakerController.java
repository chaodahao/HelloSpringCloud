package cn.chaodahao.alibaba.controller;

import cn.chaodahao.alibaba.service.PaymentService;
import cn.chaodahao.springcloud.entities.CommonResult;
import cn.chaodahao.springcloud.entities.Payment;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author: cdh
 * @date: 2023/12/13 20:28
 * @descriptions:
 */
@RestController
public class CircleBreakerController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @GetMapping("/consumer/fallback/{id}")
//    @SentinelResource(value = "fallback") //啥都不配，显示不友好的报错界面
//    @SentinelResource(value = "fallback", fallback = "handlerFallback") //只配fallback负责业务异常，显示友好的兜底方法，相当于服务降级
//    @SentinelResource(value = "fallback", blockHandler = "blockHandler") //只配blockHandler只负责sentinel控制台配置异常，业务异常显示不友好的报错界面
    @SentinelResource(value = "fallback", fallback = "handlerFallback", blockHandler = "blockHandler")//所以两个都要配置
    //注意 exceptionsToIgnore = {IllegalArgumentException.class} 这个属性可以选择性忽略某个类型的抛异常
    public CommonResult<Payment> fallback(@PathVariable("id") Long id) {
        CommonResult<Payment> result = restTemplate.getForObject(serverURL + "/paymentSQL/" + id, CommonResult.class, id);
        if (id == 4) {
            throw new IllegalArgumentException("IllegalArgumentException error...");
        } else if (result.getData() == null) {
            throw new NullPointerException("NullPointerException error...");
        }
        return result;
    }

    public CommonResult handlerFallback(@PathVariable Long id, Throwable e) {
        Payment payment = new Payment(id, "null");
        return new CommonResult<>(444, "兜底异常handlerFallback,exception内容  " + e.getMessage(), payment);
    }

    public CommonResult blockHandler(@PathVariable Long id, BlockException blockException) {
        Payment payment = new Payment(id, "null");
        return new CommonResult<>(445, "blockHandler-sentinel限流,无此流水: blockException  " + blockException.getMessage(), payment);
    }

    //==================OpenFeign
    @Resource
    private PaymentService paymentService;

    @GetMapping(value = "/consumer/openfeign/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id) {
        if (id == 4) {
            throw new RuntimeException("没有该id");
        }
        return paymentService.paymentSQL(id);
    }


}
