package com.gts.restapi.models;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter @Setter
public abstract class Vehicle {
	protected String color;
	protected double width;
	protected String plate;
	
	
	@Override
	public String toString() {
		return "Vehicle [color=" + color + ", plate=" + plate + "]";
	}
	
}
