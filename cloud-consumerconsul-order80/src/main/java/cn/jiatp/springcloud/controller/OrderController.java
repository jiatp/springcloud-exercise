package cn.jiatp.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: jiatp
 * @Date:2020/3/2823:09
 * @ClassName: OrderController
 * @Description:
 */
@RestController
@Slf4j
public class OrderController {

    private static final String INVOKE_URL = "http://consul-provider-payment";


    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/consumer/payment/consul")
    public String paymentInfo(){

        String result = restTemplate.getForObject(INVOKE_URL+"/payment/consul",String.class);
        return result;
    }
}
