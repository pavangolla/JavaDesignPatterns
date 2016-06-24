package com.designpattern.structural.composite;

/**
 * Created by pgangadhar on 5/27/16.
 */
public class Circle implements Shape {


	@Override public void draw(String fillColor) {
		System.out.println("Drawing circle with " + fillColor);
	}
}
