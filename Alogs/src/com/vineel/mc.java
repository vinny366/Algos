package com.vineel;

public class mc implements spot {
	
	VehicleSize spotsize  = VehicleSize.Motorcycle;
	int spotID;
	boolean available=true;
	public Vehicle parked=null;
	
	mc(int i){
		setdetails(i);
	}
	@Override
	public void setdetails(int id) {
		this.spotID = id;
		
	}
	public VehicleSize getSpotsize() {
		return spotsize;
	}
	public int getSpotID() {
		return spotID;
	}



}
