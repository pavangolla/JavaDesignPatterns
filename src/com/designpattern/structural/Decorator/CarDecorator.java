package com.designpattern.structural.Decorator;

/**
 * Created by pgangadhar on 6/23/16.
 */
public class CarDecorator implements Car {

	protected Car car;

	public CarDecorator(Car car) {
		this.car = car;
	}
	@Override
	public void assemble() {
		this.car.assemble();
	}
}
