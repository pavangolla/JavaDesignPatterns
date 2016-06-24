package com.designpattern.creational.abstractfactory.factory;

import com.designpattern.creational.abstractfactory.devices.ElectronicsDevice;
import com.designpattern.creational.abstractfactory.devices.Mobile;

/**
 * Created by pgangadhar on 5/20/16.
 */
public class MobileFactory implements ElectronicsAbstractFactory {

	@Override public ElectronicsDevice getMyDevice() {
		return new Mobile();
	}
}
