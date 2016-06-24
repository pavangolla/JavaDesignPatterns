package com.designpattern.structural.Bridge;

/**
 * Created by pgangadhar on 6/23/16.
 */
public class Circle extends Shape {

	public Circle(Color color) {
		super(color);
	}

	@Override void applyColor() {
		System.out.print("Circle  ---");
		color.applyColor();
	}
}
