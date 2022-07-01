package com.yujiyamamoto64.yujiwebapp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class Yujiwebapp1Application {

	 @RequestMapping(value="/")
	    public String home() {
	        return "index";
	    }
	 
	public static void main(String[] args) {
		SpringApplication.run(Yujiwebapp1Application.class, args);
	}

}
