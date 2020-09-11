import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Constructores")

public class Constructores {
 
	@Id
	@GeneratedValue
	private Long cod_Constructor;
	
	private String nombre;
	private String domicilio;
	
	
}
