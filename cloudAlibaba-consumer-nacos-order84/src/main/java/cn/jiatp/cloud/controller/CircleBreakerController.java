package cn.jiatp.cloud.controller;

import cn.jiatp.cloud.service.PaymentService;
import cn.jiatp.springcloud.entity.CommonResult;
import cn.jiatp.springcloud.entity.Payment;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author: jiatp
 * @Date:2020/4/416:53
 * @ClassName: ConsumerController
 * @Description:
 */
@RestController
@Slf4j
public class CircleBreakerController {

    @Value("${service-url.nacos-user-service}")
    private String serverUrl;

    @Resource
    private RestTemplate restTemplate;

    @Autowired
    private PaymentService paymentService;

    @GetMapping(value = "/consumer/paymentSql/{id}")
    public CommonResult<Payment> paymentSql(@PathVariable("id") Long  id){
        CommonResult<Payment> result = paymentService.paymentSql(id);
        return  result;
    }




    @RequestMapping("/consumer/fallback/{id}")
    //@SentinelResource(value = "fallback")
    // @SentinelResource(value = "fallback",fallback = "handlerFallback")
    //blockHandler只负责sentinel控制台配置违规
    //@SentinelResource(value = "fallback", blockHandler = "blockHandler")
    @SentinelResource(value = "fallback", blockHandler = "blockHandler",fallback = "fallback",exceptionsToIgnore = {IllegalArgumentException.class})
    public CommonResult<Payment> fallback(@PathVariable("id") Long id) {
        CommonResult<Payment> result = restTemplate.getForObject(serverUrl + "/paymentSql/" + id, CommonResult.class, id);

        if (id == 4) {
            throw new IllegalArgumentException("IllegalArgumentException...非法参数没有这个记录");
        } else if (result.getData() == null) {
            throw new NullPointerException("NullPointerException...此id没有这个记录，空指针异常");
        }
        return result;
    }

    public CommonResult handlerFallback(@PathVariable("id") Long id, Throwable ex) {
        Payment payment = new Payment(id, null);
        return new CommonResult(444, "兜底异常fallback,exception:" + ex.getMessage(), payment);
    }

    public  CommonResult blockHandler(@PathVariable("id") Long id, BlockException ex){
        Payment payment = new Payment(id, null);
        return new CommonResult(445,"blockHandler-sentinel限流，无此流水，BlockException:"+ex.getMessage(),payment);
    }



}
