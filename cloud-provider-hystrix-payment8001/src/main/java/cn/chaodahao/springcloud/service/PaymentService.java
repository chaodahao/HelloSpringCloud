package cn.chaodahao.springcloud.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: cdh
 * @date: 2023/11/27 21:43
 * @descriptions: HystrixPayment业务类接口
 */
public interface PaymentService {
    public String paymentInfo_OK(Integer id);
    public String paymentInfo_TimeOut(Integer id);
    public String paymentCircuitBreaker(Integer id);
}
