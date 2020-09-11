import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Partidos")
public class Partidos {

	@Id
    @GeneratedValue
    private Long cod_Partido;
	@ManyToOne
	private Canchas cancha;

	@ManyToOne
	private Colores color;

	@ManyToOne
	private Jugadores jugador_Responsable;
	
	//@OneToMany
   // private List<Participacion> participaciones;

	private Date inicio_partido;
	private Date fin_Partido;
	
}
