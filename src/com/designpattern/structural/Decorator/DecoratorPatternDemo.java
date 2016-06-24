package com.designpattern.structural.Decorator;

/**
 * Created by pgangadhar on 6/23/16.
 */
public class DecoratorPatternDemo {

	public static void main(String [] args) {
		Car baseCar = new BasicCar();
		Car sportCar = new SportsCarDec(baseCar);
		sportCar.assemble();

		Car luxuryCar = new LuxuryCarDec(sportCar);
		luxuryCar.assemble();

	}

}
