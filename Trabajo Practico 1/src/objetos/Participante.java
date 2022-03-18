package objetos;

public class Participante {

	private int id;
	private int puntosAcumulados;

	public Participante(int id) {
		this.id = id;
	}

	protected void agregarPuntos(int puntos) {
		this.puntosAcumulados = +puntos;
	}

	public int puntosParticipante() {
		return this.puntosAcumulados;
	}

}
