import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Colores")
public class Colores {
	    @Id
	    @GeneratedValue
	    private Long cod_Color;

	    
	    
	    private String descripcion;

}

