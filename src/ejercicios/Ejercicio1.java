package ejercicios;

import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		ArrayList <String> nombres = new ArrayList<>();
		
		nombres.add("Fajardo");
		nombres.add("Alberto");
		nombres.add("Manuel");
		nombres.add("Luis");
		nombres.add("Cristobal");
		nombres.add("Muñiz");
		
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
	}
	
	
}
