package cn.chaodahao.springcloud.dao;

import cn.chaodahao.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: cdh
 * @date: 2023/11/20 19:44
 * @descriptions: Payment持久类
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
    public void deletePaymentById(@Param("id") Long id);
}
