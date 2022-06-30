package com.yujiyamamoto64.yujiwebapp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Yujiwebapp1Application {
	
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World!  modified: 22063012h25";
	}

	public static void main(String[] args) {
		SpringApplication.run(Yujiwebapp1Application.class, args);
	}

}
