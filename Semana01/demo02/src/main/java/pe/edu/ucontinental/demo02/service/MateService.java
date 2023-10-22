package pe.edu.ucontinental.demo02.service;

import org.springframework.stereotype.Component;

@Component
public class MateService {
	
	public long factorial(int n) {
		if(n==0) {
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}
	
	

}
