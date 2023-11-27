package cn.chaodahao.springcloud.service;

import cn.chaodahao.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author: cdh
 * @date: 2023/11/20 20:05
 * @descriptions: Payment服务类
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

    public void deletePaymentById(@Param("id") Long id);
}
