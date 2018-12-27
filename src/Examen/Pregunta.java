package Examen;

import listaDinamica.ListaDinamica;


public class Pregunta {

		private String pregunta;
		private ListaDinamica<Respuesta> respuestas;
		private int puntos;
		
		public Pregunta(String pregunta, Examen.ListaDinamica<Respuesta> respuestas, int puntos) {
			this.pregunta = pregunta;
			this.respuesta = respuestas;
			this.puntos = puntos;
		}

		public String getPregunta() {
			return pregunta;
		}

		public ListaDinamica<Respuesta> getRespuestas() {
			return respuesta;
		}

		public int getPuntos() {
			return puntos;
		}

		
		public void mostrarPregunta() {
			
			System.out.println(pregunta);
			
			int i=0;
			while(i<respuesta.size()) {
				
				System.out.println("\t"+(i+i)+". "+respuesta.get(i));
				i++;
			}
			
		}
		
		public boolean comprobarRespuesta(int respuesta) {
			
			Respuesta r = respuestas.get(respuesta -1);
			
			if(r!=null){
				
				return r.isCorrecta();
				
				}
			
			}

	}



