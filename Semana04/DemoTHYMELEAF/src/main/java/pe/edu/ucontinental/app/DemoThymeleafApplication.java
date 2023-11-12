package pe.edu.ucontinental.app;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pe.edu.ucontinental.app.model.ClienteModel;
import pe.edu.ucontinental.app.service.EurekaService;

@SpringBootApplication
public class DemoThymeleafApplication implements CommandLineRunner{
	
	@Autowired
	private EurekaService service;

	public static void main(String[] args) {
		SpringApplication.run(DemoThymeleafApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		List<ClienteModel> lista = service.getClientes3("A","");
		for(ClienteModel r: lista) {
			System.out.println(r.getCodigo() + " - " + r.getPaterno());
		}
	}
	

}
