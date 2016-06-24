package com.designpattern.structural.composite;

/**
 * Created by pgangadhar on 5/27/16.
 */
public class Triangle implements Shape {
	@Override public void draw(String fillColor) {
		System.out.println("Draw Triangle with color " + fillColor);
	}
}
