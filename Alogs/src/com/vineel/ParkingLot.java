package com.vineel;

import java.util.ArrayList;
import java.util.Iterator;

public class ParkingLot {
	int numberofLevels;
	ArrayList<Levels> storage=new ArrayList<>();
	
	public ParkingLot(int x) {
		this.numberofLevels = x;
		for(int i=1;i<=x;i++){
			storage.add(new Levels(i));
		}
	}
	
	public boolean isAvailable(VehicleSize size){
		Iterator<Levels> i=storage.listIterator();
		while(i.hasNext()){
			Levels n=i.next();
			if(n.isAvailable(size)){
				return true;
			}
		}
		return false;
	}
	private void park(Vehicle v) {
		if(isAvailable(v.size)){
			getSlot(v);
		}
	}
	
	
	private void getSlot(Vehicle v) {
		int availId;
		Iterator<Levels> i=storage.listIterator();
		while(i.hasNext()){
			Levels n=i.next();
			if(n.isAvailable(v.size)){
				availId=n.park(v);
				
			}
		}
	}

	public static void main(String[] args) {
		ParkingLot p = new ParkingLot(3);
		
		Car c1 = new Car(111);
		p.park(c1);
	}

	

	

}
