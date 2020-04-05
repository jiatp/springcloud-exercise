package cn.jiatp.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: jiatp
 * @Date:2020/4/123:16
 * @ClassName: ConfigCLientController
 * @Description:
 */
@RestController
@Slf4j
public class ConfigCLientController {
    @Value("${server.port}")
    private String serverPort;

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    private String configInfo(){
        return "server port:"+serverPort+"\t"+"configInfo:"+configInfo;
    }
}
