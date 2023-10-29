package pe.edu.ucontinental.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app2")
public class AppController2 {
	
	@GetMapping
	public String gustavo() {
		return "gustavo";
	}

	@GetMapping("/index")
	public String home() {
		return "promedio";		
	}
	
	
}
