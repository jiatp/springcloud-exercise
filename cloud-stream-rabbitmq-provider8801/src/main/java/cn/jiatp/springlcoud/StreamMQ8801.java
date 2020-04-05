package cn.jiatp.springlcoud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: jiatp
 * @Date:2020/4/213:33
 * @ClassName: StreamMQ8801
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamMQ8801 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMQ8801.class,args);
    }
}
