package com.designpattern.structural.Bridge;

/**
 * Created by pgangadhar on 6/23/16.
 */
public abstract class Shape {
	protected Color color;

	public Shape(Color color) {
		this.color = color;
	}

	abstract void applyColor();
}
