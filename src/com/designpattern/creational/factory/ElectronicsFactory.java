package com.designpattern.creational.factory;

/**
 * Created by pgangadhar on 5/20/16.
 */
public class ElectronicsFactory {

	public ElectorincDevice getMyDevie(String deviceName) {
		ElectorincDevice electorincDevice = null;
		switch (deviceName) {
		case "Laptop": electorincDevice = new Laptop();break;
		case "Mobile": electorincDevice = new Mobile();break;
		case "Tablet": electorincDevice = new Tablet();break;
		default:break;
		}
		return electorincDevice;
	}
}
