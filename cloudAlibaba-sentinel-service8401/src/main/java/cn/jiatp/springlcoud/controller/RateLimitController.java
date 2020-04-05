package cn.jiatp.springlcoud.controller;

import cn.jiatp.springcloud.entity.CommonResult;
import cn.jiatp.springcloud.entity.Payment;
import cn.jiatp.springlcoud.handler.CustomerBlockhandler;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: jiatp
 * @Date:2020/4/415:38
 * @ClassName: RateLimitController
 * @Description:
 */
@RestController
@Slf4j
public class RateLimitController {


    @GetMapping("/byResource")
    @SentinelResource(value = "byResource", blockHandler = "myHandlerException")
    public CommonResult byResource() {
        return new CommonResult(200, "按资源名称限流测试OK", new Payment(2020L, "serial001"));
    }


    public CommonResult myHandlerException(BlockException exception) {
        return new CommonResult(444, exception.getClass().getCanonicalName() + "\t" + "服务不可用");
    }

    //---------------------
    @GetMapping("/rateLimit/byUrl")
    @SentinelResource(value = "byUrl")
    public CommonResult byUrl() {
        return new CommonResult(200, "按url限流测试OK", new Payment(2020L, "serial002"));
    }


    //CustomerBlockhandler
    @GetMapping("/rateLimit/CustomerBlockhandler")
    @SentinelResource(value = "CustomerBlockhandler",blockHandlerClass = CustomerBlockhandler.class,blockHandler = "handlerException2")
    public CommonResult CustomerBlockhandler() {
        return new CommonResult(200, "按客户自定义", new Payment(2020L, "serial003"));
    }

}
