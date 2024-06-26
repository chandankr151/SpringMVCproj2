package springmvc3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home() {
		
		return "index";
	}
	
	@GetMapping("/about")
	public String about() {
		System.out.println("This is about Controller.");
		return "about";
	}
}
