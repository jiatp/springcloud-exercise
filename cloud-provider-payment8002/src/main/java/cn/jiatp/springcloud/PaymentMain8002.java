package cn.jiatp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: jiatp
 * @Date:2020/3/2622:48
 * @ClassName: PaymentMain8001
 * @Description: 主启动
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8002{
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class,args);
    }
}
