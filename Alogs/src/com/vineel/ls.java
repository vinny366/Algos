package com.vineel;

public class ls implements spot {

	VehicleSize spotsize = VehicleSize.Bus;
	int spotID;
	boolean available=true;
	public Vehicle parked=null;

	public ls(int i) {
		setdetails(i);
	}

	public VehicleSize getSpotsize() {
		return spotsize;
	}

	public int getSpotID() {
		return spotID;
	}

	@Override
	public void setdetails(int id) {
		this.spotID = id;

	}

}
