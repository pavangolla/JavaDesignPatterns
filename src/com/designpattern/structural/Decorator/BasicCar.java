package com.designpattern.structural.Decorator;

/**
 * Created by pgangadhar on 6/23/16.
 */
public class BasicCar implements Car {

	@Override
	public void assemble() {
		System.out.print("Basic Car.");
	}
}
