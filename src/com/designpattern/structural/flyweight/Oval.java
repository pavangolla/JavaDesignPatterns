package com.designpattern.structural.flyweight;

import java.awt.*;

/**
 * Created by pgangadhar on 6/2/16.
 */
public class Oval implements Shape {

	private boolean fill;

	public Oval(boolean fill) {
		this.fill = fill;
		System.out.println("Creating Oval object with fill : " + fill);
		//adding time delay
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override public void draw(Graphics circle, int x, int y, int width, int height, Color color) {
		circle.setColor(color);
		circle.drawOval(x,y,width,height);
		if(fill) {
			circle.fillOval(x,y,width,height);
		}
	}

}
