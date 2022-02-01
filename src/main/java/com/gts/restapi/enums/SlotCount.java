package com.gts.restapi.enums;

public enum SlotCount {
	
	SLOT_CNT(10);
	
	private final int value;
	
	SlotCount(final int tmp) {
		value = tmp;
	}
	
	public int getValue() {
		return value;
	}
}
