package cn.jiatp.springcloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @Author: jiatp
 * @Date:2020/4/110:12
 * @ClassName: PaymentService
 * @Description:
 */
@Service
public class PaymentService {

    /**
     * @Author jiatp 2020/4/1  10:14
     * @Description: 正常访问
     */
    public String paymentInfo_ok(Integer id){

        return "线程池:"+Thread.currentThread().getName()+" paymentInfo_ok,id:"+id+"\t"+"success";
    }


    /**
     * @Author jiatp 2020/4/1  10:14
     * @Description: 超时
     */
    @HystrixCommand(fallbackMethod = "paymentInfo_Timeouthandler",commandProperties = {
        @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000")
    })
    public String paymentInfo_Timeout(Integer id){
        int timeNumber=13000;
        int i=10/0;
        try{
            TimeUnit.SECONDS.sleep(timeNumber);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "线程池:"+Thread.currentThread().getName()+" paymentInfo_Timeout,id:"+id+"\t"+"timeout:"+timeNumber+"...timeout";
    }
    public String paymentInfo_Timeouthandler(Integer id){

        return "线程池:"+Thread.currentThread().getName()+" paymentInfo_Timeouthandler,id:"+id+"\t"+"8001...完蛋了";
    }
//    熔断

    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_Fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"), //是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"), //秦秋次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),//
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"),

    }
    )
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
        if (id <0) {
            throw new RuntimeException("id不能为负数");
        }
        String s = IdUtil.simpleUUID();
        return Thread.currentThread().getName()+"\t"+"调用成功，流水号"+s;
    }

    public String paymentCircuitBreaker_Fallback(@PathVariable("id") Integer id){

        return "id不能为负数:id:"+id;
    }



}
