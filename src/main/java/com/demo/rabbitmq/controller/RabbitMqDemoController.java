package com.demo.rabbitmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.rabbitmq.model.Car;
import com.demo.rabbitmq.service.RabbitMqDemoService;

@RestController
@RequestMapping(value="/service-book/")
public class RabbitMqDemoController {
	
	@Autowired
	RabbitMqDemoService rabbitMqDemoService;
	
	@GetMapping(value="/service")
    public String service(@RequestParam("make") String make, @RequestParam("fuel") String fuel, 
    		@RequestParam("model") int model) {
		
		Car car =new Car(make,fuel,model);
		rabbitMqDemoService.send(car);
		return "message posted successfully in rabbitmq";
		
		
	}
}
