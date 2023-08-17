package com.flight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flight.service.FlightService;
import jakarta.validation.constraints.NotBlank;

@RestController
public class FlightCon{
    
	@Autowired
	private FlightService flightService;
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/distance")
	public String getDistance(@RequestParam(required = true) final @NotBlank String originAirportCode,@RequestParam(required = true) final @NotBlank String destinationAirportCode)throws Exception 
	{
		
		try {
			double dist = flightService.calculateDistance(originAirportCode,destinationAirportCode);
			long distance = Math.round(dist);
			return String.valueOf(distance);
		}catch(Exception e){
			return "Please enter valid airport name and code";
		}		
	}    
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/distance/time")
    public String getTime()throws Exception
    {
        String t = flightService.calculateTime();
        try {
        	return t;
		}catch(Exception e){
			return "0";
		}	
    }
}



