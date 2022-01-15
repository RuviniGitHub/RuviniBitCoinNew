package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BitCoinController {
	
	@GetMapping("/test-docker")
	public String getData() {
		return "docker tutorial ruvini";
	}
}
