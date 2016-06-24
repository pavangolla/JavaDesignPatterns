package com.designpattern.structural.flyweight;

import java.awt.*;
import java.util.HashMap;

/**
 * Created by pgangadhar on 6/2/16.
 */
public class ShapeFactory {

	private static final HashMap<ShapeType, Shape> shapes = new HashMap<>();

	public static Shape getShape(ShapeType shapeType) {
		Shape shape = shapes.get(shapeType);

		if (shape == null) {
			if(shapeType.equals(ShapeType.LINE)) {
				shape = new Line();
			}
			if(shapeType.equals(ShapeType.OVAL_FILL)) {
				shape = new Oval(true);
			}
			if(shapeType.equals(shapeType.OVAL_EMPTY)) {
				shape = new Oval(false);
			}
			shapes.put(shapeType, shape);
		}
		return shape;
	}

	public static enum ShapeType {
		OVAL_FILL,OVAL_EMPTY, LINE;
	}
}
