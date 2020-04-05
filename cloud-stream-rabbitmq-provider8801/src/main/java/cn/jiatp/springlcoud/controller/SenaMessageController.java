package cn.jiatp.springlcoud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.jiatp.springlcoud.service.IMessageProvider;

import javax.annotation.Resource;

/**
 * @Author: jiatp
 * @Date:2020/4/213:43
 * @ClassName: SenaMessageController
 * @Description:
 */
@RestController
public class SenaMessageController {
    @Resource
    private IMessageProvider iMessageProvider;

    @GetMapping("/sendMessage")
    public String sendMessage(){
        return iMessageProvider.send();
    }
}
