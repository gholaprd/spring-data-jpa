package com.rd;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Flight_Leg")
public class FlightLeg {

	@Id
	@GeneratedValue
	private int flightLegId;
	private int flightMasterId;
	private String from;
	private String to;
	
	List l = new ArrayList();
	l.add()
}
