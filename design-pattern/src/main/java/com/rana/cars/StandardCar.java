package com.rana.cars;

import com.rana.car.Car;

public class StandardCar implements Car {

	public void getTier() {
		System.out.println("got Standard tier");
		
	}

	public void getBody() {
		System.out.println("got Standard Body");
		
	}

	public void assemble() {
		System.out.println("got Standard car assembled");
		
	}

	public void testDrive() {
		System.out.println("test drive of Standard car is successful");
		
	}
}
