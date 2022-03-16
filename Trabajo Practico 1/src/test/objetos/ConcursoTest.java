package test.objetos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

import objetos.Concurso;
import objetos.Participante;

public class ConcursoTest {

	LocalDate inicio = LocalDate.of(2022, 3, 1);
	LocalDate fin = LocalDate.of(2022, 3, 20);

	@Test
	public void inscripcionParticipante() {
		// set up
		LocalDate inscripcion = LocalDate.of(2022, 3, 12);
		// Concurso(LocalDate fechaInicio, LocalDate fechaFin, int puntosConcurso)
		Concurso concurso = new Concurso(inicio, fin, 50);
		// public Participante(int id)
		Participante participante = new Participante(1);
		// excercise
		boolean resultado = concurso.inscribirse(participante, inscripcion);
		// verify
		assertEquals(true, resultado);
	}

	@Test
	public void inscripcionPrimerDia() {
		// set up
		Concurso concurso = new Concurso(inicio, fin, 20);
		Participante participante = new Participante(2);
		// exercise y verify
		assertEquals(true, concurso.inscribirse(participante, inicio));

	}

	@Test
	public void inscrpcionFueraDeTermino() {
		LocalDate inscrpcion = LocalDate.of(2022, 4, 1);
		Concurso concurso = new Concurso(inicio, fin, 30);
		Participante participante = new Participante(3);
		assertEquals(false, concurso.inscribirse(participante, inscrpcion));

	}

	@Test
	public void inscrpcionFueraDeTerminoDos() {
		LocalDate inscrpcion = LocalDate.of(2022, 2, 1);
		Concurso concurso = new Concurso(inicio, fin, 30);
		Participante participante = new Participante(3);
		assertEquals(false, concurso.inscribirse(participante, inscrpcion));
	}

}
