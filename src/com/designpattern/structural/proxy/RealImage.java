package com.designpattern.structural.proxy;

/**
 * Created by pgangadhar on 5/31/16.
 */
public class RealImage implements Image {

	String fileName;
	public RealImage(String fileName) {
		this.fileName = fileName;
		loadImage();
	}

	@Override public void display() {
		System.out.println("Displaying : " + fileName);
	}

	private void loadImage() {
		System.out.println("Loading : " + fileName);
	}
}
