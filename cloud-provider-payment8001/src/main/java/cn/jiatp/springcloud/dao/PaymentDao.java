package cn.jiatp.springcloud.dao;

import cn.jiatp.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: jiatp
 * @Date:2020/3/2623:15
 * @ClassName: PaymentDao
 * @Description:
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);


}
