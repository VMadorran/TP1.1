package objetos;

import java.time.LocalDate;

public class Inscripcion {
	private LocalDate fechaInscripcion;
	private Participante inscripto;

	public Inscripcion(Participante inscripto, LocalDate fechaInscripcion) {
		this.inscripto = inscripto;
		this.fechaInscripcion = fechaInscripcion;
	}

}
