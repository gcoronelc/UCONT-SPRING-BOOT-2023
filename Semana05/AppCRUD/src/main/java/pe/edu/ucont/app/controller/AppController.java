package pe.edu.ucont.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	@GetMapping({ "/", "/home" })
	public String home() {
		return "home";
	}

}
