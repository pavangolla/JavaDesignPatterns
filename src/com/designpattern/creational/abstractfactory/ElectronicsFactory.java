package com.designpattern.creational.abstractfactory;

import com.designpattern.creational.abstractfactory.devices.ElectronicsDevice;
import com.designpattern.creational.abstractfactory.factory.ElectronicsAbstractFactory;

/**
 * Created by pgangadhar on 5/20/16.
 */
public class ElectronicsFactory {

	public static ElectronicsDevice getElectronic(ElectronicsAbstractFactory factory) {
		return factory.getMyDevice();
	}
}
