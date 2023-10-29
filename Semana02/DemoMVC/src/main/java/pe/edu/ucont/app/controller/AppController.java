package pe.edu.ucont.app.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pe.edu.ucont.app.model.ComboModel;
import pe.edu.ucont.app.model.MateModel;
import pe.edu.ucont.app.service.MateService;

@Controller
public class AppController {

	@Autowired
	private MateService mateService;
	
	@GetMapping({"/","/home"})
	public String home(Model model) {
		model.addAttribute("mensaje","Te saluda Gustavo Coronel");
		return "home";
	}
	
	@GetMapping({"/home2"})
	public ModelAndView home2(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home2");
		mav.addObject("mensaje","Te saluda tu amigo Gustavo Coronel");
		request.setAttribute("frase", "Somos ganadores.");
		return mav;
	}
	
	@GetMapping("/sumar")
	public String sumar() {
		return "sumar";
	}
	
	@PostMapping("/sumar")
	public String sumar(
			@RequestParam("nume1") int num1,
			@RequestParam("nume2")int num2, Model model) {
		// Proceso
		int suma = mateService.sumar(num1, num2);
		// Reporte
		String reporte = num1 + " + " + num2 + " = " + suma;
		model.addAttribute("reporte",reporte);
		return "sumar";
	}
	
	@GetMapping("/matematica")
	public String matematica() {
		return "matematica";
	}
	
	@PostMapping("/matematica")
	public String matematica(@ModelAttribute MateModel mateModel, Model model) {
		// Datos
		int num1 = mateModel.getNum1();
		int num2 = mateModel.getNum2();
		// Proceso
		mateModel.setSuma(mateService.sumar(num1, num2));
		mateModel.setProducto(mateService.multiplicar(num1, num2));
		// Reporte
		model.addAttribute("titulo","MATEMATICA EN ACCION");
		model.addAttribute("modelo",mateModel);
		return "matematica";
	}
	
	@GetMapping("/venta")
	public String venta(Model model) {
		//cargarCombos(model);
		return "venta";
	}

	@ModelAttribute
	private void cargarCombos(Model model) {
		List<ComboModel> productos = new ArrayList<>();
		productos.add(new ComboModel(1, "Camisa"));
		productos.add(new ComboModel(2, "Pantalon"));
		productos.add(new ComboModel(3, "Zapatos"));
		productos.add(new ComboModel(4, "Casaca"));
		productos.add(new ComboModel(5, "Polo"));
		model.addAttribute("productos",productos);
	}
	
	
}
