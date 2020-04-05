package cn.jiatp.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author: jiatp
 * @Date:2020/4/213:58
 * @ClassName: ReceiveMessageListenerConsumer
 * @Description:
 */
@Component
@EnableBinding(Sink.class)
public class ReceiveMessageListenerConsumer {
    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void inout(Message<String> message){

        System.out.println("收到的消息："+message.getPayload()+"\t port:"+serverPort);
    }
}
