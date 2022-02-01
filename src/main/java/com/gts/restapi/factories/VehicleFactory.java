package com.gts.restapi.factories;


import com.gts.restapi.enums.VehicleTypes;
import com.gts.restapi.models.Car;
import com.gts.restapi.models.Jeep;
import com.gts.restapi.models.Truck;
import com.gts.restapi.models.Vehicle;

public class VehicleFactory {
	
	public static Vehicle getVehicle(String type, String color, String plate) {
		
		if (VehicleTypes.valueOf(type) == null) {
			throw new UnsupportedOperationException("Vehicle Type cannot be null or empty");
		}
		
		if (VehicleTypes.CAR.toString().equalsIgnoreCase(type)) {
			return new Car(color, plate);
		}
		else if (VehicleTypes.JEEP.toString().equalsIgnoreCase(type)) {
			return new Jeep(color, plate);
		}
		else if (VehicleTypes.TRUCK.toString().equalsIgnoreCase(type)) {
			return new Truck(color, plate);
		}
		throw new UnsupportedOperationException("This vehicle type is not implemented yet for " + VehicleTypes.valueOf(type) + " Supported Types are Car, Jeep and Truck");
		
	}
}
