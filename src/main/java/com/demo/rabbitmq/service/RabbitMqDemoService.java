package com.demo.rabbitmq.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.demo.rabbitmq.model.Car;

@Service
public class RabbitMqDemoService {

	@Autowired
	private AmqpTemplate rabbitMqDemoTemplate;
	
	@Value("${rabbitmq.exchange}")
	private String exchangeName;

	@Value("${rabbitmq.routingkey}")
	private String routeKeyName;
	
	public void send(Car car) {
		rabbitMqDemoTemplate.convertAndSend(exchangeName, routeKeyName, car);
		System.out.println("Message Sent = "+ car);
	}
}
