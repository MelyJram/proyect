package Examen;

import java.io.BufferedReader;
import java.io.FileReader;

import listaDinamica.ListaDinamica;

public class test {

	private ListaDinamica<Pregunta> preguntas;
	private int puntosTotales;
	private int preguntaActual;
	
	public Test() {
		preguntas = new ListaDinamica<>();
		}

	public ListaDinamica<Pregunta> getPreguntas() {
		return preguntas;
	}

	public int getPuntosTotales() {
		return puntosTotales;
	}
	public int getPreguntaActual() {
		return preguntaActual;
	}
	
	public Pregunta siguientePregunta() {
		
		Pregunta p = preguntas.get(preguntaActual);
		
		if(p!=null) {
			preguntaActual++;
		}
		
		return p;
	}
	
	public void reiniciarTest() {
		preguntaActual=0;
		
	}
	
	public void realizarTest() {
		
	}
	public void cargarFichero(String fichero) {
		
		
		BufferedReader br = new BufferedReader(new FileReader(fichero));
		
		
		String linea;
		Pregunta p;
		
		ListaDinamica<Respuesta> respuesta = new ListaDinamica<>();
		
		String texto_pregunta, texto_respuesta;
		int puntosPregunta,opcioncorrecta;
		
		
		boolean pregunta=false, respuesta=false, puntos=false;
		
		while( (linea = br.readLine()) != null) {
			
			try {
				
			
			
			if(linea.startsWith(";p;"));{
				texto_pregunta = linea.substring(3);
				pregunta = true;
		}else if(linea.startsWith(";R;")) {		
				opcioncorrecta = Integer.parseInt(linea.substring(3).trim());
				respuesta = true;
			
			}else if(respuesta) {
				puntosPregunta = Integer.parseInt(linea.trim());
				puntos = true;
			}else if(pregunta) {
				
			respuestas.add(new Respuesta(linea));
			
			if(respuestas.size()>4) {
				throw new Exception();
				}
			}	
			if(pregunta && respuesta && puntos && respuestas.size()>2 && respuestas.size()<=4) ){
				
			}
	}catch(Exception ex) {
		pregunta=false;
		puntos = false;
		respuestas=new ListaDinamica<>();
	}
		
		
		br.close();
		
		
		
	}
	
}
