package objetos;

import java.time.LocalDate;

public class Inscripcion {
	private LocalDate fechaInscripcion;
	private Participante inscripto;

	public Inscripcion(Participante inscripto) {
		this.inscripto = inscripto;
		this.fechaInscripcion = LocalDate.now();
	}

}
