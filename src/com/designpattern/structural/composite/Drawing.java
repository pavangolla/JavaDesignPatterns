package com.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pgangadhar on 5/27/16.
 */
public class Drawing implements Shape {

	List<Shape> shapes = new ArrayList<>();

	public void addShape(Shape shape) {
		getShapes().add(shape);
	}
	public List<Shape> getShapes() {
		return shapes;
	}

	@Override public void draw(String fillColor) {
		for(Shape shape : getShapes()) {
			shape.draw(fillColor);
		}
	}
}
