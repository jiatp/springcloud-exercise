package cn.jiatp.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: jiatp
 * @Date:2020/4/416:52
 * @ClassName: NacosSentinalOrder84
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class NacosSentinalOrder84 {
    public static void main(String[] args) {
        SpringApplication.run(NacosSentinalOrder84.class,args);
    }
}
