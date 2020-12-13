package com.demo.rabbitmq.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Car {

	private String make;
	private String fuel;
	private int model;

	public Car(String make, String fuel,int model) {
		this.make=make;
		this.fuel=fuel;
	    this.model=model;
	}

	@Override

	public String toString() {
		return "Car [make=" + make + "fuel=" + fuel + "model=" + model + "]";
	}
}
