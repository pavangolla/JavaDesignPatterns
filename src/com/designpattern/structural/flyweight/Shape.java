package com.designpattern.structural.flyweight;

import java.awt.*;

/**
 * Created by pgangadhar on 6/2/16.
 */
public interface Shape {

	void draw(Graphics g, int x, int y, int width, int height, Color color);
}
