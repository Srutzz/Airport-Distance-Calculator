package com.flight.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.entity.FlightEntity;

@Repository
public interface FlightRepository extends JpaRepository<FlightEntity, Integer>{
     Optional<FlightEntity> findByIATACode(String airportcode);
}
