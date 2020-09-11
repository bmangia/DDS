import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Canchas")
public class Canchas {
	@Id
    @GeneratedValue
    private Long cod_canchas;
	private String nombre;
	private boolean esta_Iluminada;
	
	@ManyToOne
    private Colores cod_color;
}
