package com.designpattern.structural.flyweight;

import java.awt.*;

/**
 * Created by pgangadhar on 6/2/16.
 */
public class Line implements Shape {

	public Line() {
		System.out.println("Creating Line");
		//adding time delay
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Override public void draw(Graphics line, int x, int y, int width, int height, Color color) {
		line.setColor(color);
		line.drawLine(x,y,width,height);
	}
}
