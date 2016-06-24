package com.designpattern.creational.abstractfactory.factory;

import com.designpattern.creational.abstractfactory.devices.ElectronicsDevice;
import com.designpattern.creational.abstractfactory.devices.Laptop;

/**
 * Created by pgangadhar on 5/20/16.
 */
public class LaptopFactory implements ElectronicsAbstractFactory {

	@Override
	public ElectronicsDevice getMyDevice() {
		return new Laptop();
	}
}
