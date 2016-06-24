package com.designpattern.creational.abstractfactory;

import com.designpattern.creational.abstractfactory.devices.ElectronicsDevice;
import com.designpattern.creational.abstractfactory.factory.LaptopFactory;
import com.designpattern.creational.abstractfactory.factory.MobileFactory;

/**
 * Created by pgangadhar on 5/20/16.
 */
public class TestAbstractFactoryPattern {

	public static void main(String args[]) {
		ElectronicsDevice laptop = ElectronicsFactory.getElectronic(new LaptopFactory());
		System.out.println(laptop);
		ElectronicsDevice mobile = ElectronicsFactory.getElectronic(new MobileFactory());
		System.out.println(mobile);
	}
}
