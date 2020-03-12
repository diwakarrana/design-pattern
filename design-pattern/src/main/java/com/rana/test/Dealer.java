package com.rana.test;

import com.rana.car.Car;
import com.rana.carfactory.CarFactory;

public class Dealer {

	public static void main(String[] args) {
		System.out.println("hi rana");
		Car c = CarFactory.getCar("standard");
	
	}
}
