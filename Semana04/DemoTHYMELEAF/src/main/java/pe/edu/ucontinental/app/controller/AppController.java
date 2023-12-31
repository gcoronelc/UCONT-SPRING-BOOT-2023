package pe.edu.ucontinental.app.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import pe.edu.ucontinental.app.model.ClienteModel;
import pe.edu.ucontinental.app.model.MateModel;
import pe.edu.ucontinental.app.model.PagoModel;
import pe.edu.ucontinental.app.model.Producto;
import pe.edu.ucontinental.app.service.EurekaService;
import pe.edu.ucontinental.app.service.PagoService;

@Controller
public class AppController {
	
	@Autowired
	private PagoService pagoService;
	
	@Autowired
	private EurekaService eurekaService;
	
	@GetMapping({ "", "/", "/index" })
	public String index(Model model) {
		model.addAttribute("titulo", "SALUDO");
		model.addAttribute("mensaje", "Bienvenido a Thymeleaf.");
		return "index";
	}
	

	@GetMapping({ "/home" })
	public String home(Model model) {
		model.addAttribute("titulo", "SALUDO");
		model.addAttribute("mensaje", "Bienvenido a Thymeleaf.");
		return "home";
	}

	@GetMapping("/datos")
	public String datos(Model model) {
		Producto producto = new Producto(1000, "Licuadora", 598.00, 768);
		model.addAttribute("titulo", "Datos del Producto");
		model.addAttribute("producto", producto);
		return "datos";
	}

	@GetMapping("/listado")
	public String listado(Model model) {
		List<Producto> productos = new ArrayList<>();
		productos.add(new Producto(1001, "Producto A", 598.00, 768));
		productos.add(new Producto(1002, "Producto B", 783.00, 100));
		productos.add(new Producto(1003, "Producto C", 278.00, 350));
		productos.add(new Producto(1004, "Producto D", 723.00, 820));
		productos.add(new Producto(1005, "Producto E", 634.00, 649));
		model.addAttribute("titulo", "Listado de Productos");
		model.addAttribute("productos", productos);
		return "listado";
	}

	@GetMapping("/promedio")
	public String promedio(Model model) {
		model.addAttribute("promedio", 17);
		model.addAttribute("role", "programer");
		return "promedio";
	}

	@GetMapping("/calculadora")
	public String calculadora(Model model) {
		MateModel mate = new MateModel();
		model.addAttribute("titulo", "CALCULADORA BASICA");
		model.addAttribute("mate", mate);
		return "calculadora";
	}

	@PostMapping("/calculadora")
	public String calculadora(@ModelAttribute MateModel mate, Model model) {
		// Proceso
		mate.setSuma(mate.getNum1() + mate.getNum2());
		mate.setProducto(mate.getNum1() * mate.getNum2());
		// Reporte
		model.addAttribute("titulo", "CALCULADORA BASICA");
		model.addAttribute("resultado", "LOS RESULTADOS");
		model.addAttribute("mate", mate);
		return "calculadora";
	}
	
	@GetMapping("/pago")
	public String pago(Model model) {
		PagoModel pago = new PagoModel();
		model.addAttribute("pago", pago);
		return "pago";
	}
	
	@PostMapping("/pago")
	public String pago(@ModelAttribute PagoModel pago, Model model) {
		pago = pagoService.procesar(pago);
		model.addAttribute("pago", pago);
		model.addAttribute("rpta", "Ok");
		return "pago";
	}
	
	@ModelAttribute
	public void addAttributes(Model model) {
		model.addAttribute("TITULO", "PAGO DEL TRABAJADOR");
	}
	
	
	@GetMapping("/clientes")
	public String clientes(Model model) {
		return "clientes";
	}
	
	@PostMapping("/clientes")
	public String clientes(@ModelAttribute ClienteModel datos, Model model) {
		String paterno = datos.getPaterno();
		String materno = datos.getMaterno();
		List<ClienteModel> lista = eurekaService.getClientes3(paterno, materno);
		model.addAttribute("lista", lista);
		return "clientes";
	}

}
