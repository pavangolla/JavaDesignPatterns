package com.designpattern.creational.builder;

/**
 * Created by pgangadhar on 5/20/16.
 */
public class Computer {

	private String HDD;
	private String RAM;

	private boolean isGraphicsEnabled;
	private boolean isBluetoothEnabled;

	private Computer(ComputerBuilder computerBuilder) {
		this.HDD = computerBuilder.HDD;
		this.RAM = computerBuilder.RAM;
		this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
		this.isGraphicsEnabled = computerBuilder.isGraphicsEnabled;
	}

	public static class ComputerBuilder {
		private String HDD;
		private String RAM;

		private boolean isGraphicsEnabled;
		private boolean isBluetoothEnabled;

		public ComputerBuilder(String HDD, String RAM) {
			this.HDD = HDD;
			this.RAM = RAM;
		}

		public ComputerBuilder setGraphicsEnabled(boolean graphicsEnabled) {
			this.isGraphicsEnabled = graphicsEnabled;
			return this;
		}

		public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
			this.isBluetoothEnabled = bluetoothEnabled;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}
	}

	@Override public String toString() {
		final StringBuffer sb = new StringBuffer("Computer{");
		sb.append("HDD='").append(HDD).append('\'');
		sb.append(", RAM='").append(RAM).append('\'');
		sb.append(", isGraphicsEnabled=").append(isGraphicsEnabled);
		sb.append(", isBluetoothEnabled=").append(isBluetoothEnabled);
		sb.append('}');
		return sb.toString();
	}
}
