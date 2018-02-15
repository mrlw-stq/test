package com.mrlw.dd.structural.adapter.socket;

public class SocketAdapterImpl extends Socket implements SocketAdapter {

	public Volt get120Volt() {
		return getVolt();
	}

	public Volt get12Volt() {
		return new Volt(getVolt().getVolt() / 10);
	}

	public Volt get3Volt() {
		return new Volt(getVolt().getVolt() / 40);
	}

}
