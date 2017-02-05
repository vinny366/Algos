package com.vineel;

public class Car extends Vehicle {
	public Car(VehicleSize s){
		this.licenseplate = 123;
		this.size = s;
		this.spotsNeeded = 1;
	}
	@Override
	public void clearSpot(){}
	@Override
	public void setSpot(){}

	@Override
	boolean caFit() {
		// TODO Auto-generated method stub
		return false;
	}
}
