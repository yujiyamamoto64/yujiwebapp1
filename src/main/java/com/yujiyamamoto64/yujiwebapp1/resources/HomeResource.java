package com.yujiyamamoto64.yujiwebapp1.resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeResource {

	@GetMapping
	public String home() {
		return "index";
	}
	
}
