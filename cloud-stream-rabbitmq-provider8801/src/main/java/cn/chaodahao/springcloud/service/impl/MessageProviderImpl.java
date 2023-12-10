package cn.chaodahao.springcloud.service.impl;

import cn.chaodahao.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author: cdh
 * @date: 2023/12/10 11:21
 * @descriptions:
 */
//@Service (不需要，因为这个类不是传统的controller调service,而是和mq进行绑定,使用EnableBinding)
@EnableBinding(Source.class) // 可以理解为是一个消息的发送管道的定义
public class MessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output; // 消息的发送管道

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());// 创建并发送消息
        System.out.println("***serial: "+serial);

        return serial;
    }
}
