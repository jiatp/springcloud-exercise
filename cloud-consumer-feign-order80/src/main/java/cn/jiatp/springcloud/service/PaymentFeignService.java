package cn.jiatp.springcloud.service;

import cn.jiatp.springcloud.entity.CommonResult;
import cn.jiatp.springcloud.entity.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: jiatp
 * @Date:2020/3/3122:09
 * @ClassName: PaymentFeignService
 * @Description:
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long  id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignService();
}
