package cn.jiatp.springcloud.controller;

import cn.jiatp.springcloud.service.PaymentHystixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: jiatp
 * @Date:2020/4/112:00
 * @ClassName: PaymentCOntroller
 * @Description:
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "payment_Global_fallbackMethod")
public class PaymentCOntroller {

    @Autowired
    private PaymentHystixService paymentHystixService;

    @GetMapping("/payment/histrix/ok/{id}")
    public String paymentInfo_ok(@PathVariable("id") Integer id){
        String s = paymentHystixService.paymentInfo_ok(id);
        return s;

    }

//    @HystrixCommand(fallbackMethod = "paymentInfo_Timeouthandler",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1500")
//    })
    @HystrixCommand
    @GetMapping("/payment/histrix/timeout/{id}")
    public String paymentInfo_timeout(@PathVariable("id") Integer id){
        int i=10/0;
        String s = paymentHystixService.paymentInfo_timeout(id);
        return s;
    }
    public String paymentInfo_Timeouthandler(Integer id){

        return "线程池:"+Thread.currentThread().getName()+" paymentInfo_Timeouthandler,id:"+id+"\t"+"...80消费者...完蛋了";
    }

    /**
     * @Author jiatp 2020/4/1  12:59
     * @Description: gloabal
     */
    public String payment_Global_fallbackMethod(Integer id){

        return "线程池:"+Thread.currentThread().getName()+" paymentInfo_Timeouthandler,id:"+id+"\t"+"......全局的！！！";
    }
}
