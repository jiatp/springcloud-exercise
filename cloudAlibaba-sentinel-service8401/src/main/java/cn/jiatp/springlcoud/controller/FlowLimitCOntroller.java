package cn.jiatp.springlcoud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @Author: jiatp
 * @Date:2020/4/321:47
 * @ClassName: FlowLimitCOntroller
 * @Description:
 */
@RestController
@Slf4j
public class FlowLimitCOntroller {

    @GetMapping("/testA")
    public String testA(){
        return "-----testA";
    }
    @GetMapping("/testB")
    public String testB(){
        log.info(Thread.currentThread().getName()+"\t ......testB");
        return "-----testB";
    }

    @GetMapping("/testD")
    public String testD()  {
        log.info(Thread.currentThread().getName()+"\t ......testD");
        int i=10/0;
        return "-----testD";
    }

    @GetMapping("/testE")
    public String testE()  {
        log.info(Thread.currentThread().getName()+"\t ......testE");
        int i=10/0;
        return "-----testE";
    }

    @GetMapping("/testHotkey")
    @SentinelResource(value = "testHotkey",blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2",required = false) String p2) {
        log.info(Thread.currentThread().getName()+"\t ......testKotkey");
        int age=10/0;
        return "-----testHotkey";
    }


    public String deal_testHotKey(String p1, String p2, BlockException exception) {
        return "----deal_testHotKey";
    }
}
