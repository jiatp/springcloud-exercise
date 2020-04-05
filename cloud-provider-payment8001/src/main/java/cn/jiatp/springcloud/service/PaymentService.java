package cn.jiatp.springcloud.service;

import cn.jiatp.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: jiatp
 * @Date:2020/3/2623:28
 * @ClassName: PaymentService
 * @Description:
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
