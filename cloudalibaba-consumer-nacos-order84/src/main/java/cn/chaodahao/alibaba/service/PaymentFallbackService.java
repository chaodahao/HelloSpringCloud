package cn.chaodahao.alibaba.service;

import cn.chaodahao.springcloud.entities.CommonResult;
import cn.chaodahao.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author: cdh
 * @date: 2023/12/13 21:16
 * @descriptions:
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444, "服务降级返回,没有该流水信息", new Payment(id, "errorSerial......"));
    }
}
