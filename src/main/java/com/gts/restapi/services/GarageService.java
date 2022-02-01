package com.gts.restapi.services;

import com.gts.restapi.exceptions.ParkException;
import com.gts.restapi.models.Vehicle;

public interface GarageService {
	
	public String park(Vehicle vehicle) throws ParkException;
	public String leave(Vehicle vehicle) throws ParkException;
	public String status() throws ParkException;
	public String leave(int id) throws ParkException;
	public String park(String type, String color, String plate);
	
}
