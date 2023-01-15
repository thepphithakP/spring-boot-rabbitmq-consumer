package com.pluem.rabbitmq.rabbitmqsample.comsumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;

@RabbitListener(queues = {"${consumer.customer.queue-name}"})
public class MessageReceiver {

    @RabbitHandler
    public void receive(@Payload String payload) {
        System.out.println(payload);
    }

}
