package pe.edu.ucont.app.service;

import org.springframework.stereotype.Service;

@Service
public class MateService {

	
	public int sumar(int n1, int n2) {
		return (n1+n2);
	}
	
	public int multiplicar(int n1, int n2) {
		return (n1*n2);
	}
}
