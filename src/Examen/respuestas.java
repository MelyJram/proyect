package Examen;

public class respuestas {

	private String respuesta;
	private boolean correcta;
	
	public respuestas(String respuesta) {
		this.respuesta = respuesta;
	}

	public String getRespuesta() {
		return respuesta;
	}

	
	public boolean isCorrecta() {
		return correcta;
	}
	public void serCorrecta(boolean correcta) {
		this.correcta = correcta;
	}

	@Override
	public String toString() {
		return respuesta;
		}
	
	
	
}
