package cn.chaodahao.alibaba.controller;

import cn.chaodahao.alibaba.myhandler.CustomerBlockHandler;
import cn.chaodahao.springcloud.entities.CommonResult;
import cn.chaodahao.springcloud.entities.Payment;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: cdh
 * @date: 2023/12/12 21:14
 * @descriptions:  注意：@SentinelResource注解不支持private方法！！！
 */
@RestController
public class RateLimitController {
    @GetMapping("/byResource")
    @SentinelResource(value = "byResource", blockHandler = "handleException")
    public CommonResult byResource() {
        return new CommonResult(200, "按资源名称限流测试OK", new Payment(2020L, "serial001"));
    }

    public CommonResult handleException(BlockException exception) {
        return new CommonResult(444, exception.getClass().getCanonicalName() + "\t 服务不可用");
    }

    @GetMapping("/rateLimit/byUrl")
    @SentinelResource(value = "byUrl")
    public CommonResult byUrl() {
        return new CommonResult(200, "按url限流测试OK", new Payment(2020L, "serial002"));
    }

    @GetMapping("/rateLimit/customerBlokHandle")
    @SentinelResource(value = "customerBlokHandle", blockHandlerClass = CustomerBlockHandler.class, blockHandler = "handleException")
    public CommonResult customerBlokHandle(){
        return new CommonResult(200, "Normal result...");
    }
}
