package com.gts.restapi.models;


import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class ParkingLot {
	
	private Vehicle vehicle;
	private int index;
	
	public ParkingLot(Vehicle vehicle, int index) {
		this.vehicle = vehicle;
		this.index = index;
	}
	
	// 
	
	private List<Integer> getInterval(ParkingLot parkingLot) {
		List<Integer> interval = new ArrayList<>();
		for (int i = 0; i < this.getVehicle().getWidth(); i++) {
			interval.add(index + i);
		}
		return interval;
	}
	
	public int compareTo(ParkingLot parkingLot) {
		return this.index - parkingLot.index;
	}
	
	@Override
	public String toString() {
		return vehicle.toString() + " " + getInterval();
	}
	
	
}
