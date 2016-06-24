package com.designpattern.structural.Decorator;

/**
 * Created by pgangadhar on 6/23/16.
 */
public class LuxuryCarDec extends CarDecorator {

	public LuxuryCarDec(Car car) {
		super(car);
	}

	@Override
	public void assemble() {
		car.assemble();
		System.out.println("Adding Luxury Car Features");
	}
}
