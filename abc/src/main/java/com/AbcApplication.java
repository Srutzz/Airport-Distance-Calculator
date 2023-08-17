package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

//import com.flight.serv.FlightServiceImplementaion;

//import com.flight.service.FlightServiceImplementation;

@SpringBootApplication
@Configuration
public class AbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbcApplication.class, args);
		//System.out.println("abcd");
		//FlightServiceImplementaion f = new FlightServiceImplementaion();
		//f.calculateDistance("MA","SS");
		
	    }  
		
		//AbcApplication obj=new AbcApplication();
		//System.out.println(obj.distance(38.898556, -77.037852, 38.897147, -77.043934) + " Miles");
	

}