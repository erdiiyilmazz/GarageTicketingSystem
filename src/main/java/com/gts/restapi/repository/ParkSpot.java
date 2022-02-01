package com.gts.restapi.repository;

import java.util.HashSet;
import java.util.Iterator;

import com.gts.restapi.enums.ExceptionEnum;
import com.gts.restapi.models.ParkingLot;
import com.gts.restapi.models.Vehicle;

public class ParkSpot {

	private HashSet<ParkingLot> parkingLots = new HashSet<>();

	public String parkCommand(Vehicle vehicle) {
		if (parkingLots.isEmpty()) {
			parkingLots.add(new ParkingLot(vehicle, 1));
			String status = "Allocated " + vehicle.getWidth() + " slot(s)";
		} else {
			Iterator<ParkingLot> parkingLotIterator = parkingLots.iterator();
			double currentIndex = 0;
			boolean placed = false;
			while (parkingLotIterator.hasNext()) {
				ParkingLot parkingLot = (ParkingLot) parkingLotIterator.next();
				if ((parkingLot.getIndex() - currentIndex) > (vehicle.getWidth() + 1)) {
					parkingLots.add(new ParkingLot(vehicle, (int) (currentIndex + 1)));
					String status = "Allocated " + vehicle.getWidth() + " slot(s).";
					placed = true;
					break;
				} else {
					currentIndex = parkingLot.getIndex() + parkingLot.getVehicle().getWidth();
				}
			}

			if (!placed) {
				if (currentIndex + vehicle.getWidth() <= 10) {
					parkingLots.add(new ParkingLot(vehicle, (int) currentIndex));
					String status = "Allocated " + vehicle.getWidth() + " slot(s).";
				} else {
					ExceptionEnum.PARKING_ERROR.toString();
				}
			}
		}
	}return status;

	public String leave(int index) {
		String statusMessage;
		if (!parkingLots.isEmpty()) {
			int i = 1;
			ParkingLot parkingLot = null;
			Iterator<ParkingLot> iterator = parkingLots.iterator();
			while (iterator.hasNext()) {
				if(i == index) {
				 parkingLot = iterator.next();
				break;
			}
			iterator.next();
			i++;
		} 
		if (parkingLot != null) {
			parkingLots.remove(parkingLot);
		    statusMessage = index + ". car leaved";
		} else {
			ExceptionEnum.VEHICLE_NOT_FOUND.toString();
			}
		}
		else {
			ExceptionEnum.PARKING_ERROR.toString();
		}
		return statusMessage;
	}
