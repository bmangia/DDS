import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Jugadores")

public class Jugadores {

	@Id
    @GeneratedValue
    private Long cod_Jugador;
	@ManyToOne
    private Paletas paleta;
	
    private String nombre;
    
    private String apellido;
    
    private String domicilio;
    
    private int  nacimiento;
    private String telefono;

    
}
