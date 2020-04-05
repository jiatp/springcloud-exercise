package cn.jiatp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: jiatp
 * @Date:2020/4/214:09
 * @ClassName: StreamMQ8803
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamMQ8803 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMQ8803.class,args);
    }

}
