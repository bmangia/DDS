import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Participacion")
public class Participacion {
	@Id
    @GeneratedValue
    private Long cod_Jugador;
	@ManyToOne
	
    private Partidos cod_Partido;
	
	@ManyToOne
	 private Paletas cod_Paleta;

	    

	@ManyToOne
	private Jugadores cod_jugador;
	
}
