package cn.jiatp.springlcoud.handler;

import cn.jiatp.springcloud.entity.CommonResult;
import cn.jiatp.springcloud.entity.Payment;
import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @Author: jiatp
 * @Date:2020/4/416:10
 * @ClassName: CustomerBlockhandler
 * @Description:
 */
public class CustomerBlockhandler {

    public static CommonResult handlerException1(BlockException exception){
        return new CommonResult(444, "按客户定义，global handlerException---01 ,");
    }

    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult(444, "按客户定义，global handlerException---02 ,");
    }
}
