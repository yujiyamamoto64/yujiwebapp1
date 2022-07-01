package com.yujiyamamoto64.yujiwebapp1.resources;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.yujiyamamoto64.yujiwebapp1.entities.Greeting;

@Controller
public class GreetingResource {

	@GetMapping("/greeting")
	  public String greetingForm(Model model) {
	    model.addAttribute("greeting", new Greeting());
	    return "greeting";
	  }

	  @PostMapping("/greeting")
	  public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
	    model.addAttribute("greeting", greeting);
	    return "result";
	  }
}
