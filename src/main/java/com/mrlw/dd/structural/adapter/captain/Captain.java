package com.mrlw.dd.structural.adapter.captain;

public class Captain implements RowingBoat {

	RowingBoat rowingBoat;

	public Captain(RowingBoat rowingBoat) {
		this.rowingBoat = rowingBoat;
	}


	public void row() {
		this.row();
		System.out.println("Captain rowing!");
	}

}
