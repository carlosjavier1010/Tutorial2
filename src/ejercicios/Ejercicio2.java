package ejercicios;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {

		ArrayList<Integer> aleatorio = new ArrayList<>();

		int numeroList = (int) (Math.random() * (20 - 10 + 1) + 10);
		double suma = 0;
		double media = 0;
		int min = 100;
		int max = 0;

		for (int i = 0; i < numeroList; i++) {
			int numeroAzar = (int) (Math.random() * (100 - 0 + 1) + 0);
			aleatorio.add(numeroAzar);
			suma += numeroAzar;
		}

		media = suma / numeroList;

		for (int i = 0; i < aleatorio.size(); i++) {

			if (aleatorio.get(i) < min) {
				min = aleatorio.get(i);
			}
			if (aleatorio.get(i) > max) {
				max = aleatorio.get(i);
			}
		}

		for (Integer integer : aleatorio) {
			System.out.print(integer + " / ");
		}
		
		System.out.println();
		
		System.out.println("suma:" + suma);
		System.out.println("media:" + media);
		System.out.println("minimo:" + (int) min);
		System.out.println("maximo:" + (int) max);
	}

}
