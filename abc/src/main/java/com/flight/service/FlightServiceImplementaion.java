package com.flight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.entity.FlightEntity;
import com.flight.repo.FlightRepository;

@Service
public class FlightServiceImplementaion implements FlightService{

	@Autowired
	private FlightRepository fr;
	double dist,theta;
	public FlightEntity getinfo(String airportcode) {
		FlightEntity airport = fr.findByIATACode(airportcode).get();
		System.out.println(airport.toString());
		return airport;
	}
	public double calculateDistance(String origin, String destination) {
		FlightEntity originAirport = getinfo(origin);
	    FlightEntity destinationAirport = getinfo(destination);
	        
	    if(originAirport!=null && destinationAirport!=null)
	    	return distance(originAirport.getLattitude(), originAirport.getLongitude(), destinationAirport.getLattitude(),destinationAirport.getLongitude());
	        System.out.println(distance(originAirport.getLattitude(), originAirport.getLongitude(), destinationAirport.getLattitude(),destinationAirport.getLongitude()));
	        return -1;
	    }
	    public double distance(double lat1, double lon1, double lat2, double lon2) {
	          
	          theta=lon1-lon2;
	          dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
	          dist = Math.acos(dist);
	          dist = rad2deg(dist);
	          dist = dist * 60 * 1.1515;
	          dist = dist * 1.609344;
	          return (dist);
	    }
	    
	    public double deg2rad(double deg) {
	          return (deg * Math.PI / 180.0);
	    }
	    public double rad2deg(double rad) {
	          return (rad * 180.0 / Math.PI);
	    }
	    
	    public String calculateTime()

        {
//	    	 FlightEntity originAirport = getinfo(origin);
//		     FlightEntity destinationAirport = getinfo(destination);
//		       if(originAirport!=null && destinationAirport!=null) {
//		    	   double dist=distance(originAirport.getLattitude(), originAirport.getLongitude(), destinationAirport.getLattitude(),destinationAirport.getLongitude());
		    	   return time();
//		       }   
//		       return "-1";
        }
	    
	    public String time() {
	    	double dd=dist*0.621;
            double time;
            time=.117*dd+ .517*(theta) + 43.2;
            return String.valueOf(Math.round(time));	    
        }
	    
	    public static String minuteToTime(double time)
	    {
	    	int hours = (int)time/60;
	    	int minutes = (int)time % 60;
	    	double m=time%60;
	    	int seconds = (int) ((m-minutes)*60);
	    	String s=String.format("%d:%d:%d",hours,minutes,seconds);
	    	return s;    	
	    }	    
}