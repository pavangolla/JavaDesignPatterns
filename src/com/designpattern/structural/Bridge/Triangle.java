package com.designpattern.structural.Bridge;

/**
 * Created by pgangadhar on 6/23/16.
 */
public class Triangle extends Shape {

	public Triangle(Color color) {
		super(color);
	}
	@Override
	public void applyColor() {
		System.out.print("Triangle  --- ");
		color.applyColor();
	}
}
