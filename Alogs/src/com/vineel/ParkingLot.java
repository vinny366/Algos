package com.vineel;

import java.util.ArrayList;

public class ParkingLot {
	ArrayList<spot>  s;
	private int occupied =0;
	int totalSize;
	public ParkingLot(int spots) {
		s = new ArrayList<spot>(spots);
		this.totalSize = spots;
	}
	
	public boolean isFull(){
		return (totalSize-occupied)>0 ? false:true;
	}
	
	public static void main(String[] args) {
		ParkingLot asu = new ParkingLot(5);
		Car c1 = new Car(VehicleSize.Compact);
		if(!asu.isFull()){
			asu.park(c1);
		}
	}

	private void park(Car c1) {
		
		spot s = new spot(1,1,VehicleSize.Compact);
		
	}

}
