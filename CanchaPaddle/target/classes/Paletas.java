import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Paletas {
	@Id
	@GeneratedValue
	private Long codigo;
	
	private String nombre;
	private float grosor;
	
	
}
