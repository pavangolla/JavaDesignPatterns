package com.designpattern.structural.Decorator;

/**
 * Created by pgangadhar on 6/23/16.
 */
public class SportsCarDec extends CarDecorator {

	public SportsCarDec(Car car) {
		super(car);
	}

	@Override
	public void assemble() {
		car.assemble();
		System.out.print("adding Sprots Card Feature");
	}
}
