package pe.edu.ucontinental.app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class AppController {

	@GetMapping({ "", "/", "/index", "/home", "/gustavo" })
	public String home(Model model) {
		model.addAttribute("mensaje", "Te saluda Gustavo Coronel.");
		model.addAttribute("arreglo", new String[] { "Lima", "Cusco", "Arequipa", "Chiclayo" });
		return "index";
	}

	@GetMapping("venta")
	public void venta(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// Datos
		double precio = Double.parseDouble(request.getParameter("precio"));
		int cant = Integer.parseInt(request.getParameter("cant"));
		// Proceso
		double importe = precio * cant;
		// Reporte
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<h1>VENTA</h1>");
		out.println("<p>Precio: " + precio + "</p>");
		out.println("<p>Cant: " + cant + "</p>");
		out.println("<p>Importe: " + importe + "</p>");
	}
	
	@GetMapping("/promedio")
	public String promedio() {
		return "promedio";
	}
	
	@PostMapping("/promedio")
	public ModelAndView promedio(int n1, int n2, int n3) {
		// Proceso
		int pr = (n1 + n2 + n3) / 3;
		// Reporte
		ModelAndView mav = new ModelAndView("promedio");
		mav.addObject("n1",n1);
		mav.addObject("n2",n2);
		mav.addObject("n3",n3);
		mav.addObject("pr",pr);
		return mav;
	}
	
	
	
}
