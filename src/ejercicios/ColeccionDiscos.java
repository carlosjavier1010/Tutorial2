package ejercicios;

public class ColeccionDiscos {
	
	//prueba commit 
	
	private int codigo = 0;
	private String autor;
	private String titulo;
	private String genero;
	private int duracion;
	private boolean libre = true;
	private static int posicionLibre = 1;
	private boolean borrado = false;
	public boolean isBorrado() {
		return borrado;
	}
	public void setBorrado(boolean borrado) {
		this.borrado = borrado;
	}
	public ColeccionDiscos(String autor, String titulo, String genero, int duracion) {
		
		this.codigo = posicionLibre;
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
		this.libre = false;
		this.borrado = false;
		posicionLibre++;
	}
	public ColeccionDiscos(String autor, String titulo, String genero, int duracion,int codigo){ //Para modificar.
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
		this.codigo = codigo;
		this.libre = false;
		this.borrado = false;
	}
	public ColeccionDiscos(){
		this.libre = true;
		this.borrado = false;
		
	}
	public boolean isLibre() {
		return libre;
	}
	public void setLibre(boolean libre) {
		this.libre = libre;
	}
	public static int getPosicionLibre() {
		return posicionLibre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public String toString() {
		String cadena = "\n------------------------------------------"; 
		cadena += "\nCódigo: " + this.codigo; cadena += "\nAutor: " + this.autor;
		cadena += "\nTítulo: " + this.titulo; cadena += "\nGénero: " + this.genero; 
		cadena += "\nDuración: " + this.duracion; cadena += "\n------------------------------------------";
	return cadena;
	}
	public void borrar(boolean libre){
		if (libre==false) {
			this.libre = true;
			this.borrado = true;
			System.out.println("Se ha borrado correctamente.");
		}
		
	}
	
}
