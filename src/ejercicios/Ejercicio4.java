package ejercicios;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//modificacin en la rama pruebas
		ArrayList<String> palabras = new ArrayList<>();

		palabras.add("antonio");
		palabras.add("pepe");
		palabras.add("jose");
		palabras.add("israel");
		palabras.add("agustin");

		Collections.sort(palabras);

		for (String muestra : palabras) {

			System.out.println(muestra);
		}
	}

}
