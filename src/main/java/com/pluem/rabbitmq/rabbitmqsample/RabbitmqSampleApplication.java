package com.pluem.rabbitmq.rabbitmqsample;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class RabbitmqSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqSampleApplication.class, args);
	}

}
