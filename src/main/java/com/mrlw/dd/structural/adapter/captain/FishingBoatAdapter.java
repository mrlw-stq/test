package com.mrlw.dd.structural.adapter.captain;

public class FishingBoatAdapter implements RowingBoat {
	
	FishingBoat fishingBoat;

	public FishingBoatAdapter() {
		super();
		this.fishingBoat = new FishingBoat();
	}


	public void row() {
		System.out.println("FishingBoatAdapter rowing and ... ");
		this.fishingBoat.sail();
	}

	public static void main(String[] args) {
		Captain captain = new Captain(new FishingBoatAdapter());
		captain.row();
	}
}
