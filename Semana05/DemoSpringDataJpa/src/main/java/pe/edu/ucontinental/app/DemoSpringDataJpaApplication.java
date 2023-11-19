package pe.edu.ucontinental.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pe.edu.ucontinental.app.model.Mensaje;
import pe.edu.ucontinental.app.repository.MensajeRepository;

@SpringBootApplication
public class DemoSpringDataJpaApplication implements CommandLineRunner{

	@Autowired
	private MensajeRepository mensajeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoSpringDataJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("HOLA TODOS");
		// crearMensaje();
		// modificarId2();
		// eliminarId3();
		// mostrarTodos();
		mensajesDe("Gustavo");
	}

	private void mensajesDe(String de) {
		Iterable<Mensaje> lista = mensajeRepository.findByDe("Gustavo");
		for(Mensaje bean: lista) {
			System.out.println(bean);
		}
	}

	private void mostrarTodos() {
		Iterable<Mensaje> lista = mensajeRepository.findAll();
		for(Mensaje bean: lista) {
			System.out.println(bean);
		}
	}

	private void eliminarId3() {
		mensajeRepository.deleteById(3L);
		System.out.println("Proceso ok.");
	}

	private void modificarId2() {
		Mensaje bean = mensajeRepository.findById(2L).get();
		bean.setDe("Karla");
		mensajeRepository.save(bean);
		System.out.println("Proceso ok.");
	}

	private void crearMensaje() {
		Mensaje bean = new Mensaje();
		bean.setDe("Gustavo");
		bean.setPara("Todos");
		bean.setTexto("Nos vemos en el examen.");
		bean = mensajeRepository.save(bean);
		System.out.println("ID: " + bean.getId());
	}
	
	

}
