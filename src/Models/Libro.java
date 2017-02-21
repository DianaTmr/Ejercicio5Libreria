package Models;

public class Libro {
	
	private String titulo;
	private String autor;
	private int npaginas;
	private int calificacion;


	public Libro(String titulo, String autor, int npaginas, int calificacion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.npaginas = npaginas;
		this.calificacion = calificacion;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getNpaginas() {
		return npaginas;
	}


	public void setNpaginas(int npaginas) {
		this.npaginas = npaginas;
	}


	public int getCalificacion() {
		return calificacion;
	}


	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getAutor() {
		return autor;
	}




}
