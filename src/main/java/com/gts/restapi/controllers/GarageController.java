package com.gts.restapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gts.restapi.exceptions.ParkException;
import com.gts.restapi.services.GarageService;

@RestController
@RequestMapping("/garage/")
public class GarageController {

	@Autowired
	private GarageService garageService;

	@GetMapping("/status")
    public String status() throws ParkException{
        return garageService.status();
	}    
        
	@DeleteMapping("/leave/{id}")
	public String leave(@PathVariable("id") int id) throws ParkException {
		return garageService.leave(id);
	}

	@PostMapping("/park/{type}")
	public String park(@PathVariable("type") String type, @RequestParam("color") String color,
			@RequestParam("plate") String plate) {
		return garageService.park(type, color, plate);
	}
}
