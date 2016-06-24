package com.designpattern.structural.Bridge;

/**
 * Created by pgangadhar on 6/23/16.
 */
public class BridgePatternDemo {

	public static void main(String [] args) {
		Shape redTriangle = new Triangle(new RedColor());
		Shape greenCircle = new Circle(new GreenColor());
		redTriangle.applyColor();
		greenCircle.applyColor();
	}
}
