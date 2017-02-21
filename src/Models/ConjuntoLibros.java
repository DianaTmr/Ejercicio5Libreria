package Models;
import Models.Libro;
import java.util.ArrayList;

public class ConjuntoLibros {
	
	private String conjunto;
	ArrayList<Libro> libros;
	
	
	// CONSTRUCTOR

	public ConjuntoLibros(String conjunto) {
		super();
		this.conjunto = conjunto;
		this.libros = new ArrayList<Libro>() ;
	}
	
	// GETTERS Y SETTERS
	public String getConjunto() {
		return conjunto;
	}


	public void setConjunto(String conjunto) {
		this.conjunto = conjunto;
	}


	public ArrayList<Libro> getLibros() {
		return libros;
	}


	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}

	public void addcoleccion(Libro l){
		this.libros.add(l);
	}

	
	public void addLibro (Libro l){
		boolean existe = false;
		for(Libro lib: libros){
			if (lib != null && lib.getTitulo().equals(l.getTitulo())){
				existe = true;
				break;
			}
		}
		if (!existe){
			this.libros.add(l);
		}
	}
 
		public Libro getMayorNota(){
			Libro mayornota = libros.get(0);
			for (int i = 0; i < libros.size()-1; i++){
				if (mayornota.getCalificacion() < libros.get(i+1).getCalificacion()){
					mayornota = libros.get(i+1);
				}
			}
			return mayornota;
		}
		public Libro getMenorNota(){
			Libro menornota = libros.get(0);
			for (int i = 0; i < libros.size()-1; i++){
				if (menornota.getCalificacion() > libros.get(i+1).getCalificacion()){
					menornota = libros.get(i+1);
				}
			}
			return menornota;
		}
		
		
		public void borrarAutor(String autor){
			for (int i = 0; i < libros.size()-1; i++){
				if (libros.get(i).getAutor() == autor){
					libros.remove(i);
				}
			}
			
		}
		public Libro borrarTitulo(String titulo){
			for (int i = 0; i < libros.size()-1; i++){
				if (libros.get(i).getTitulo() == titulo){
					libros.remove(i);
				}
			}
			return null;
			
		}
	
		public void imprimir(ArrayList<Libro> libros){
			for (Libro lib : libros){
				System.out.println(lib.getTitulo());
			}
		}

		
}
