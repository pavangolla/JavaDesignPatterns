package com.designpattern.creational.abstractfactory.factory;

import com.designpattern.creational.abstractfactory.devices.ElectronicsDevice;

/**
 * Created by pgangadhar on 5/20/16.
 */
public interface ElectronicsAbstractFactory {

	public ElectronicsDevice getMyDevice();
}
