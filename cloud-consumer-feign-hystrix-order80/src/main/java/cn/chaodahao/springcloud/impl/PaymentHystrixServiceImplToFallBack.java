package cn.chaodahao.springcloud.impl;

import cn.chaodahao.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @author: cdh
 * @date: 2023/11/28 22:03
 * @descriptions:
 */
@Component
public class PaymentHystrixServiceImplToFallBack implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "**************PaymentHystrixServiceImplToFallBack: paymentInfo_OK/(ㄒoㄒ)/~~***************";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "**************PaymentHystrixServiceImplToFallBack: paymentInfo_TimeOut/(ㄒoㄒ)/~~***************";
    }
}
