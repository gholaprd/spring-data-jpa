package com.rd;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<FlightDetails, Integer>{

	public List<FlightDetails> findByFlightDate(String string);
}
