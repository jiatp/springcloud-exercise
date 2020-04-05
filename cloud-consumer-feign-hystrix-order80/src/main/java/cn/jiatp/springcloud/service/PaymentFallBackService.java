package cn.jiatp.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Author: jiatp
 * @Date:2020/4/113:16
 * @ClassName: PaymentFallBackService
 * @Description:
 */
@Component
public class PaymentFallBackService implements PaymentHystixService {


    @Override
    public String paymentInfo_ok(Integer id) {
        return "---PaymentFallBackService ==paymentInfo_ok ";
    }

    @Override
    public String paymentInfo_timeout(Integer id) {
        return "PaymentFallBackService=====paymentInfo_timeout";
    }
}
