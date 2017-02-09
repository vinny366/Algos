package com.vineel;

public class Levels {
	int level;
	mc mcspots[];
	cs compactspot[];
	ls largespot[];
	int mcAvail, compactAvail, largeAvail;

	public Levels(int id, int mc, int cs, int ls) {
		level = id;
		mcspots = new mc[mc];
		compactspot = new cs[cs];
		largespot = new ls[ls];
		initialize();
	}

	public Levels(int id) {
		level = id;
		mcspots = new mc[2];
		compactspot = new cs[2];
		largespot = new ls[1];
		initialize();
	}

	public boolean isAvailable(VehicleSize size) {
		if (size == VehicleSize.Compact) {
			return (compactAvail > 0 || largeAvail > 0) ? true : false;
		} else if (size == VehicleSize.Motorcycle) {
			return (mcAvail > 0 || compactAvail > 0 || largeAvail > 0) ? true : false;
		} else if (size == VehicleSize.Bus) {
			return largeAvail > 0 ? true : false;
		}
		return false;
	}

	private void initialize() {
		int i = level * 100;
		for (int j = 0; j < mcspots.length; j++) {
			mcspots[j] = new mc(++i);
		}
		for (int j = 0; j < compactspot.length; j++) {
			compactspot[j] = new cs(++i);
		}
		for (int j = 0; j < largespot.length; j++) {
			largespot[j] = new ls(++i);
		}
		mcAvail = mcspots.length;
		compactAvail = compactspot.length;
		largeAvail = largespot.length;
	}

	public int park(Vehicle v) {
		if (v.size == VehicleSize.Compact) {
			for (int j = 0; j < compactspot.length; j++) {
				if(compactspot[j].available){
					compactAvail--;
					compactspot[j].parked=v;
					return ((cs) compactspot[j]).getSpotID();
				}
			}
			for (int j = 0; j < largespot.length; j++) {
				if(largespot[j].available){
					largeAvail--;
					return largespot[j].getSpotID();
				}
			}
		} else if (v.size == VehicleSize.Motorcycle) {
			for (int j = 0; j < mcspots.length; j++) {
				if(mcspots[j].available){
					mcAvail--;
					return mcspots[j].getSpotID();
				}
			}
			for (int j = 0; j < compactspot.length; j++) {
				if(compactspot[j].available){
					compactAvail--;
					compactspot[j].parked=v;
					return ((cs) compactspot[j]).getSpotID();
				}
			}
			for (int j = 0; j < largespot.length; j++) {
				if(largespot[j].available){
					largeAvail--;
					return largespot[j].getSpotID();
				}
			}
		} else if (v.size == VehicleSize.Bus) {
			for (int j = 0; j < largespot.length; j++) {
				if(largespot[j].available){
					largeAvail--;
					return largespot[j].getSpotID();
				}
			}
		}
		return -1;
	}
}
