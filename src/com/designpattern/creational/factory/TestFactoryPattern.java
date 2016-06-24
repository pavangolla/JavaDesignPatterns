package com.designpattern.creational.factory;

/**
 * Created by pgangadhar on 5/20/16.
 */
public class TestFactoryPattern {

	public static void main(String args[]) {
		ElectronicsFactory electronicsFactory = new ElectronicsFactory();
		String device = args != null && args.length > 0 ? args[0] : "";
		System.out.println(electronicsFactory.getMyDevie(device));
	}
}
