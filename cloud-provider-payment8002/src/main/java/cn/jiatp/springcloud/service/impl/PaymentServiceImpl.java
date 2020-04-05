package cn.jiatp.springcloud.service.impl;

import cn.jiatp.springcloud.dao.PaymentDao;
import cn.jiatp.springcloud.entity.Payment;
import cn.jiatp.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: jiatp
 * @Date:2020/3/2623:30
 * @ClassName: PaymentServiceImpl
 * @Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
