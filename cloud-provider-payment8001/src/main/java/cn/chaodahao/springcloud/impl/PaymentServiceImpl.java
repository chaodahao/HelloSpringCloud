package cn.chaodahao.springcloud.impl;

import cn.chaodahao.springcloud.dao.PaymentDao;
import cn.chaodahao.springcloud.entities.Payment;
import cn.chaodahao.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: cdh
 * @date: 2023/11/20 20:07
 * @descriptions: Payment实现类
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource //java自带的依赖注入
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

    @Override
    public void deletePaymentById(Long id) {
        paymentDao.deletePaymentById(id);
    }
}
