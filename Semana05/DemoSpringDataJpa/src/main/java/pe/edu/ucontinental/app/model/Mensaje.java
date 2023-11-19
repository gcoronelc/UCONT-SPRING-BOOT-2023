package pe.edu.ucontinental.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TBL_MENSAJE")
@SequenceGenerator(name = "sq_mensaje", sequenceName = "sq_mensaje", allocationSize = 1)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mensaje {

	@Id
	@Column(name = "msg_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_mensaje")
	private Long id;

	@Column(name = "msg_de", length = 50, nullable = false)
	private String de;

	@Column(name = "msg_para", length = 50, nullable = false)
	private String para;

	@Column(name = "msg_text", length = 1000, nullable = false)
	private String texto;

	
}
