import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Paletas")

public class Paletas {
	@Id
	@GeneratedValue
	private Long cod_Paleta;
	
	private String nombre;
	private float grosor;
	
	@ManyToOne
	private Colores cod_Color;
	
	@ManyToOne
	
	private Constructores cod_Constructor;
	
	
}
