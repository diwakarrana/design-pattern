package com.rana.carfactory;

import com.rana.car.Car;
import com.rana.cars.LuxoryCar;
import com.rana.cars.SportCar;
import com.rana.cars.StandardCar;

public class CarFactory {

	static Car car;
	
	public static Car getCar(String ca) {
		
		if(ca.equalsIgnoreCase("standard"))
			car = new StandardCar();
		else if(ca.equalsIgnoreCase("luxory"))
			car = new LuxoryCar();
		else if(ca.equalsIgnoreCase("sport"))
			car = new SportCar();
		car.getTier();
		car.getBody();
		car.assemble();
		car.testDrive();
	return car;
	}
}
