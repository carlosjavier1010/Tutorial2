package ejercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);

		HashMap<Integer, String> m = new HashMap<>();

		int oportunidad = 3;
		boolean encontrado = false, salir = false;
		String usuario = "";
		int contraseña = 0;

		m.put(123456789, "Carlos");
		m.put(123456, "Pepe");

		while (oportunidad >= 0 && encontrado == false && salir == false) {
			if (oportunidad==3) {
				System.out.println("Introduce nombre usuario");
				usuario = scan.nextLine();
				
			}
			
			while (encontrado==false && salir==false) {
				
			
			for (Map.Entry<Integer, String> claves : m.entrySet()) {
				if (claves.getValue().equals(usuario) ) {
					encontrado = true;
				}
			}
			if (encontrado==false) {
				System.out.println("El usuario no existe.");
				oportunidad--;
				if (oportunidad>0) {
					System.out.println("Introduce nombre usuario");
					usuario = scan.nextLine();
				}
				
			}
			if (oportunidad==0 && encontrado == false) {
				System.out.println("Has consumido las 3 oportunidades.");
				salir = true;
			}
			}
			if (salir==false && encontrado==true) {
				
			
			encontrado = false;
			oportunidad=3;
			System.out.println("Introduce contraseña");
			contraseña = scanner.nextInt();
			
			
			
			
			
			for (Map.Entry<Integer, String> claves : m.entrySet()) {
				if (claves.getValue().equals(usuario) && claves.getKey().equals(contraseña)) {
					System.out.println("Ha accedido al area restringida");
					encontrado = true;
					salir=true;
				}
			}
			
			if (encontrado==false) {
				oportunidad--;
			}
			
			if (oportunidad == 0 && encontrado == false) {
				System.out.println("Has consumido las 3 oportunidades.");
				salir = true;
			}
			}
		}

		System.out.println("Hasta luego!");
		scan.close();
		scanner.close();
	}

}
