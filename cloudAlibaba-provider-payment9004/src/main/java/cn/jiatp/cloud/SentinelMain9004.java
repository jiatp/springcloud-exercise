package cn.jiatp.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: jiatp
 * @Date:2020/4/416:33
 * @ClassName: SentinelMain9003
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelMain9004 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelMain9004.class,args);
    }
}
