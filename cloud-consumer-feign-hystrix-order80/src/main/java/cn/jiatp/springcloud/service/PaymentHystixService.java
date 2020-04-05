package cn.jiatp.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: jiatp
 * @Date:2020/4/111:58
 * @InterfaceName: PaymentHystixService
 * @Description:
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT",fallback = PaymentFallBackService.class)
public interface PaymentHystixService {

    @GetMapping("/payment/histrix/ok/{id}")
    public String paymentInfo_ok(@PathVariable("id") Integer id);

    @GetMapping("/payment/histrix/timeout/{id}")
    public String paymentInfo_timeout(@PathVariable("id") Integer id);
}
