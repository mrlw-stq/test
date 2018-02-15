package com.mrlw.dd.creational.builder;

public class Computer {

	private String ram;
	private String cpu;

	private boolean isGPX;
	private boolean isBlueT;


	private Computer(ComputerBuilder builder) {
		this.ram = builder.ram;
		this.cpu = builder.cpu;
		this.isGPX = builder.isGPX;
		this.isBlueT = builder.isBlueT;
	}

	@Override
	public String toString() {
		return "Computer [ram=" + ram + ", cpu=" + cpu + ", isGPX=" + isGPX + ", isBlueT=" + isBlueT + "]";
	}

	static class ComputerBuilder {

		private String ram;
		private String cpu;

		private boolean isGPX;
		private boolean isBlueT;

		public ComputerBuilder(String ram, String cpu) {
			super();
			this.ram = ram;
			this.cpu = cpu;
		}

		public String getRam() {
			return ram;
		}

		public String getCpu() {
			return cpu;
		}
		public void setCpu(String cpu) {
			this.cpu = cpu;
		}
		public boolean isGPX() {
			return isGPX;
		}
		public ComputerBuilder setGPX(boolean isGPX) {
			this.isGPX = isGPX;
			return this;
		}
		public boolean isBlueT() {
			return isBlueT;
		}
		public ComputerBuilder setBlueT(boolean isBlueT) {
			this.isBlueT = isBlueT;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}

	}
	
	public static void main(String[] args) {
		Computer computer = new Computer.ComputerBuilder("3.5", "3.5").setBlueT(true).build();
		System.out.println(computer);
	}
}
