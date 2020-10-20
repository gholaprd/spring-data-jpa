package com.rd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/name")
public class TestController {
	
	
	@GetMapping(path = "/getName")
	public String getName() {
		return "Jay Prakash did it and he fuuuu";
		
	}

}
