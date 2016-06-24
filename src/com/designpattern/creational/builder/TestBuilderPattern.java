package com.designpattern.creational.builder;

/**
 * Created by pgangadhar on 5/20/16.
 */
public class TestBuilderPattern {

	public static void main(String args[]) {

		Computer.ComputerBuilder computerBuilder = new Computer.ComputerBuilder("1TB", "16GB");
		Computer computer = computerBuilder.setBluetoothEnabled(true).setGraphicsEnabled(true).build();
		System.out.println(computer);
	}
}
