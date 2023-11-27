package cn.chaodahao.springcloud.controller;

import cn.chaodahao.springcloud.entities.CommonResult;
import cn.chaodahao.springcloud.entities.Payment;
import cn.chaodahao.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author: cdh
 * @date: 2023/11/20 20:11
 * @descriptions: Payment控制类
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("*************插入结果：" + result);

        if(result > 0){
            return new CommonResult(200, "插入数据库成功！" + "\t 服务端口："+serverPort, result);
        }else{
            return new CommonResult(444, "插入数据库失败！", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment result = paymentService.getPaymentById(id);
        log.info("*************查询结果：" + result);

        if(result != null){
            return new CommonResult(200, "查询成功！" + "\t 服务端口："+serverPort, result);
        }else{
            return new CommonResult(444, "没有对应记录！查询id = "+id, null);
        }
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }
}
