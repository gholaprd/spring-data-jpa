package com.rd;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
//@RequestMapping("/flight")
public class FlightController {

	@Autowired
	private FlightRepository flightRepository;

	@PostMapping(value = "/createFlight", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<FlightDetails> createFlight(@RequestBody FlightDetails flightDetails) {
		
		FlightDetails save = flightRepository.save(flightDetails);
		return new ResponseEntity<FlightDetails>(save, HttpStatus.CREATED);

	}

	@GetMapping("getAllFlightDetails")
	public ResponseEntity<List<FlightDetails>> findAll() {

		List<FlightDetails> findAll = flightRepository.findAll();
		return new ResponseEntity<List<FlightDetails>>(findAll, HttpStatus.OK);
	}

	@GetMapping(value  = "findFlightByMasterId")
	public ResponseEntity<FlightDetails> getFlightByFlightMasterId(@RequestParam("flightMasterId") int flightMasterId) {
		Optional<FlightDetails> findbyId = flightRepository.findById(flightMasterId);
		return new ResponseEntity<FlightDetails>(findbyId.get(), HttpStatus.OK);
	}

	@GetMapping(value = "/getAllFlightDetailsByDate", produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<FlightDetails>> findFlightByDate(@RequestParam Map<String, String> queryParam) {

		Date date1;
		try {
			date1 = new SimpleDateFormat("yyyy-MM-dd hh:mm").parse(queryParam.get("flightDate"));
			List<FlightDetails> findAll = flightRepository.findByFlightDate(date1);
			return new ResponseEntity<List<FlightDetails>>(findAll, HttpStatus.OK);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseEntity<List<FlightDetails>>(HttpStatus.OK);
	}
}
