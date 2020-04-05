package cn.jiatp.cloud.service;

import cn.jiatp.springcloud.entity.CommonResult;
import cn.jiatp.springcloud.entity.Payment;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author: jiatp
 * @Date:2020/4/418:19
 * @ClassName: PaymentFallBackService
 * @Description:
 */
@Component
public class PaymentFallBackService implements PaymentService {

    @Override
    public CommonResult<Payment> paymentSql(Long id) {
        return new CommonResult<>(444,"服务降级返回，PaymentFallBackService",new Payment(id,"errorSerial"));
    }
}
