package com.vineel;

public class cs implements spot {

	VehicleSize spotsize  = VehicleSize.Compact;
	int spotID;
	boolean available=true;
	public Vehicle parked=null;
	
	public VehicleSize getSpotsize() {
		return spotsize;
	}

	public int getSpotID() {
		return spotID;
	}

	public cs(int i) {
		setdetails(i);
	}

	@Override
	public void setdetails(int id) {
		this.spotID = id;
		
	}

}
