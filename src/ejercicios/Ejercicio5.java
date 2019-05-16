package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
	
		ArrayList<ColeccionDiscos> discos = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		
		String autor="",titulo="",genero="";
		int duracion = 0, opcion = 0,codigo = 0, opcionSub = 0;
		boolean encontrado = false;
		
		
		for (int i = 0; i < 5; i++) {
			
			discos.add(new ColeccionDiscos());
		}
		
		do {
			System.out.println("\n\nCOLECCIÓN DE DISCOS");

		      System.out.println("===================");

		      System.out.println("1. Listado");

		      System.out.println("2. Nuevo disco");

		      System.out.println("3. Modificar");

		      System.out.println("4. Borrar");

		      System.out.println("5. Salir");

		      System.out.print("Introduzca una opción: ");
		      opcion = scanner.nextInt();
		      
		      switch (opcion) {
			case 1:
				for (int i = 0; i < ColeccionDiscos.getPosicionLibre() && i < discos.size(); i++) {
					if (ColeccionDiscos.getPosicionLibre()<2) {
						
						System.out.println("Aún no se ha creado ningún disco.");
					
					}else if (discos.get(i).isLibre()==false) {
						System.out.println("Disco Nº "+(i+1));
						System.out.println(discos.get(i).toString());
						encontrado = true;
					}else if (i==ColeccionDiscos.getPosicionLibre()-1 && encontrado==false) {
						System.out.println("Listado de Discos Vacio. Ningún Disco para mostrar...");
					}
				}
				
				encontrado = false;
				
				while (opcionSub !=3) {
					
					System.out.println("1. Ver listado de discos de un autor 2. Ver listado de discos por Género 3. Salir");
					opcionSub = scanner.nextInt();
				
				if (opcionSub==1) {
					System.out.println("Indica el autor del cual deseas ver sus discos.");
					autor = scan.nextLine();
					for (int i = 0; i < ColeccionDiscos.getPosicionLibre()-1; i++) {
						
						if (discos.get(i).getAutor().equalsIgnoreCase(autor)) {
							System.out.println(discos.get(i).toString());
							encontrado =true;
							
						}
						else  {
							System.out.println("No se ha encontrado ningún disco del Autor que has introducido.");
							
						}
						
						
					}
					
				}else if (opcionSub==2) {
					System.out.println("Indica el Genero del cual deseas ver los discos.");
					genero = scan.nextLine();
					for (int i = 0; i < ColeccionDiscos.getPosicionLibre()-1; i++) {
						
						if (discos.get(i).getGenero().equalsIgnoreCase(genero)) {
							System.out.println(discos.get(i).toString());
							encontrado =true;
							
						}else {
							System.out.println("No se ha encontrado ningún disco del genero que has introducido.");
						}
						
						
					}
					
				}
				
				}
				encontrado = false;
				opcionSub = 0;
				break;
			
			case 2:
				
					
				
				for (int i = 0; i < ColeccionDiscos.getPosicionLibre() && i < discos.size(); i++) {
					
					if (discos.get(i).isLibre()==true && discos.get(i).isBorrado()==true) {
						
						System.out.println("Introduce autor del Disco");
						autor = scan.nextLine();
						System.out.println("Introduce titulo del Disco");
						titulo = scan.nextLine();
						System.out.println("Introduce genero del Disco");
						genero = scan.nextLine();
						System.out.println("Introduce duracion en minutos del Disco");
						duracion = scanner.nextInt();
						
						discos.add(new ColeccionDiscos(autor, titulo, genero, duracion,discos.get(i).getCodigo()));
						discos.get(i).setBorrado(false);
						encontrado = true;
						i=ColeccionDiscos.getPosicionLibre();
						
					} 
					
					else if (discos.get(i).isLibre()==true && i==ColeccionDiscos.getPosicionLibre()-1 && encontrado==false) {
						System.out.println("Introduce autor del Disco");
						autor = scan.nextLine();
						System.out.println("Introduce titulo del Disco");
						titulo = scan.nextLine();
						System.out.println("Introduce genero del Disco");
						genero = scan.nextLine();
						System.out.println("Introduce duracion en minutos del Disco");
						duracion = scanner.nextInt();
						discos.add(ColeccionDiscos.getPosicionLibre()-1,new ColeccionDiscos(autor, titulo, genero, duracion));
						
						i=ColeccionDiscos.getPosicionLibre();
						
						
					}
					
					if (i==discos.size()-1) {
						System.out.println("Se ha alcanzado el limite máximo de discos, para poder crear un disco nuevo, debes borrar alguno.");
					}
				}
				
				encontrado = false;
				
				break;
			case 3:
				System.out.println("\nMODIFICAR");
		        System.out.println("===========");
		        System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
		        codigo = scanner.nextInt();
		        
		        for (int i = 0; i < ColeccionDiscos.getPosicionLibre(); i++) {
					
		        	if (discos.get(i).getCodigo()==codigo) {
		        		System.out.println("Introduce autor del Disco");
						autor = scan.nextLine();
						System.out.println("Introduce titulo del Disco");
						titulo = scan.nextLine();
						System.out.println("Introduce genero del Disco");
						genero = scan.nextLine();
						System.out.println("Introduce duracion en minutos del Disco");
						duracion = scanner.nextInt();
						
						discos.add(discos.get(i).getCodigo(),new ColeccionDiscos(autor, titulo, genero, duracion,discos.get(i).getCodigo()));
						
						encontrado = true;
						i= ColeccionDiscos.getPosicionLibre();
					} else if (discos.get(i).getCodigo()!=codigo && i==ColeccionDiscos.getPosicionLibre()-1 && encontrado==false) {
						System.out.println("Codigo de disco introducido para modificar incorrecto, no existe ningun disco con ese codigo.");
					}
						
					
				}
		        encontrado = false;
				break;
			case 4:
				 System.out.println("\nBORRAR");
			        System.out.println("======");
			        System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
			        codigo = scanner.nextInt();
			        
			        for (int i = 0; i < ColeccionDiscos.getPosicionLibre() && i < discos.size(); i++) {
						
			        	if (discos.get(i).getCodigo()==codigo) {
			        		
							discos.remove(i);
							encontrado = true;
						}else if (discos.get(i).getCodigo()!=codigo && i==ColeccionDiscos.getPosicionLibre()-1 && encontrado==false) {
							System.out.println("Codigo de disco introducido para borrar incorrecto, no existe ningun disco con ese codigo.");
							
						}
					}
			    encontrado = false;
				break;
			
			default:
				break;
			}
		      
		} while (opcion!=5);
		
		scan.close();
		scanner.close();
		
		System.out.println("Hasta luego !!!");
	}

}
