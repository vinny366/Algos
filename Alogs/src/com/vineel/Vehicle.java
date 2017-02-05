package com.vineel;

public abstract class Vehicle {
	public int licenseplate;
	public VehicleSize size;
	public int spotsNeeded;	
	abstract void clearSpot();	
	abstract void setSpot();
	abstract boolean caFit();
}
