package com.abhinav;

import org.springframework.stereotype.Component;

@Component("C")
public class Car implements Vehicle {

	@Override
	public void drive() {
		System.out.println("Car Drive");
	}

}
