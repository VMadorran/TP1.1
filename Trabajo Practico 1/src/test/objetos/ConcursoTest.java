package test.objetos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

import objetos.Concurso;
import objetos.Participante;

public class ConcursoTest {

	@Test
	public void inscripcionParticipante() {

		LocalDate inicio = LocalDate.now().minusDays(3);
		LocalDate fin = LocalDate.now().plusDays(15);

		Concurso concurso = new Concurso(inicio, fin, 50);
		Participante participante = new Participante(1);
		boolean resultado = concurso.inscribirse(participante);

		assertEquals(true, resultado);
	}

	@Test
	public void inscripcionPrimerDia() {

		LocalDate inicio = LocalDate.now();
		LocalDate fin = LocalDate.now().plusDays(15);

		Concurso concurso = new Concurso(inicio, fin, 20);
		Participante participante = new Participante(2);
		int puntosParticipante = participante.puntosParticipante();
		concurso.inscribirse(participante);

		assertEquals(puntosParticipante + 10, participante.puntosParticipante());
	}

	@Test
	public void inscrpcionFueraDeTermino() {

		LocalDate inicio = LocalDate.now().minusMonths(2);
		LocalDate fin = LocalDate.now().minusMonths(1);

		Concurso concurso = new Concurso(inicio, fin, 30);
		Participante participante = new Participante(3);

		assertEquals(false, concurso.inscribirse(participante));
	}

}
