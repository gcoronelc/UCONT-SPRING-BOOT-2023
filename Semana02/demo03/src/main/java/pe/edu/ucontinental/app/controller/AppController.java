package pe.edu.ucontinental.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	@GetMapping({"","/","/index","/home","/gustavo"})
	public String home(Model model) {
		model.addAttribute("mensaje","Te saluda Gustavo Coronel.");
		model.addAttribute("arreglo",new String[]{"Lima","Cusco","Arequipa","Chiclayo"});
		return "index";
	}
	
	
}
