package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Brian Clozel
 */
@Controller
public class TestController {

	@GetMapping("/")
	public String hello() {
		return "test";
	}
}
