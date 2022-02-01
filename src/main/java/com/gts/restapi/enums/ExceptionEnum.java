package com.gts.restapi.enums;

public enum ExceptionEnum {
	PARKING_ERROR("Parking Error ",1), 
	LEAVING_ERROR("Leaving Error ",2), 
	LISTING_ERROR("Listing Error ",3),
	VEHICLE_EMPTY("Vehicle is empty! You must enter vehicle information.",4),
	INVALID_REQUEST("Invalid Request",5),
	VEHICLE_ID_CANNOT_EXCEED_TEN("Vehicle no cannot be greater than ten.",6),
	VEHICLE_NOT_FOUND("Vehicle cannot be found.",7),
	VEHICLE_ALREADY_EXIST("Vehicle allready exist.",8),
	UNDEFINED_VEHICLE_TYPE("Vehicle Type is undefined.",9);
	
	
	public String message = "";
	public int exceptionCode;
	
    public String getMessage() {
		return message;
	}

	public int getExceptionCode() {
		return exceptionCode;
	}

	ExceptionEnum(String message, int exceptionCode) {
			this.message = message;
			this.exceptionCode = exceptionCode;
	}
	
	private ExceptionEnum(String message) {
		this.message = message;
	}
	
	
	
}

