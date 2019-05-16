package ejercicios;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Modificacion en la rama pruebas
		
		ArrayList <Integer> numeros = new ArrayList<>();
		int n = 0;
		
		for (int i = 10; i > n; i--) {
			
			numeros.add(i);
		}
		
		Collections.sort(numeros);
		
		for (Integer numero : numeros) {
			
			System.out.println(numero);
		}
		
	}

}
