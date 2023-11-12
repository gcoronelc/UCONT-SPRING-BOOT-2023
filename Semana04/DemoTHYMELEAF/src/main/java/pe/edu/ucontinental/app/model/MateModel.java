package pe.edu.ucontinental.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MateModel {

	private Integer num1;
	private Integer num2;
	private Integer suma;
	private Integer producto;

	public MateModel(Integer num1, Integer num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
}
