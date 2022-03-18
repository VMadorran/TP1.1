package objetos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Concurso {
	private ArrayList<Inscripcion> inscriptos = new ArrayList<>();
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private int puntosConcurso;

	public Concurso(LocalDate fechaInicio, LocalDate fechaFin, int puntosConcurso) {

		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.puntosConcurso = puntosConcurso;
	}

	public boolean inscribirse(Participante participante) {
		if (this.inscripcionEnTermino()) {
			Inscripcion nuevaInscripcion = new Inscripcion(participante);
			this.inscriptos.add(nuevaInscripcion);
			if (LocalDate.now().equals(fechaInicio))
				participante.agregarPuntos(10);
			return true;
		}
		return false;
	}

	private boolean inscripcionEnTermino() {
		LocalDate inscripcion = LocalDate.now();
		if (((inscripcion.isAfter(fechaInicio)) || (inscripcion.isEqual(fechaInicio)))
				&& ((inscripcion.isBefore(fechaFin)) || (inscripcion.isEqual(fechaFin)))) {
			return true;
		}
		return false;
	}
}
