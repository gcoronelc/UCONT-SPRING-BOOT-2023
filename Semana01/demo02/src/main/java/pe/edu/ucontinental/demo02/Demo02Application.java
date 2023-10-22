package pe.edu.ucontinental.demo02;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pe.edu.ucontinental.demo02.service.MateService;
import pe.edu.ucontinental.demo02.service.ProductoService;
import pe.edu.ucontinental.demo02.service.VentaService;

@SpringBootApplication
public class Demo02Application implements CommandLineRunner{
	
	@Autowired
	private ProductoService productoService;
	
	@Autowired
	private MateService service;
	
	@Autowired
	private VentaService ventaService;
	
	

	public static void main(String[] args) {
		SpringApplication.run(Demo02Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hola amigos.");
		System.out.println("Factorial de 5 es: " + service.factorial(5));
		ventaService.registrarVenta();
		productoService.registrar();
	}

}
