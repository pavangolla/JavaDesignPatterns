package com.designpattern.structural.proxy;

/**
 * Created by pgangadhar on 5/31/16.
 */

/**
 * This Proxy object controls the functionality of RealImage loading and display
 *
 */
public class ImageProxy implements Image {

	RealImage realImage;
	String fileName;
	public ImageProxy(String fileName) {
		this.fileName = fileName;
	}

	@Override public void display() {
		if(realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}
}
