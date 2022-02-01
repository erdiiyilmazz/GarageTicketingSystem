package com.gts.restapi.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.gts.restapi.enums.ExceptionEnum;
import com.gts.restapi.enums.VehicleTypes;
import com.gts.restapi.factories.VehicleFactory;
import com.gts.restapi.models.ParkingLot;
import com.gts.restapi.models.Vehicle;



public class GarageServiceImpl implements GarageService{
	
	@Autowired
	private ParkingLot parkingLot;

	public String park(String color, String width, String plate) {
		Vehicle vehicle = VehicleFactory.getVehicle(width, color, plate);
		if (vehicle != null) {
			return parkingLot.park(vehicle);
		}
		return ExceptionEnum.VEHICLE_NOT_FOUND.toString() + VehicleTypes.class;
	}
	
	@Override
	public String leave(int index) {
		return parkingLot.leave(index);
	}
	
	@Override
	public String status() {
		return parkingLot.status();
	}
}
