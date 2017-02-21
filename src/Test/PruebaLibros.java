package Test;
import Models.*;

public class PruebaLibros {

	public static void main(String[] args) {
		

		ConjuntoLibros conjunto = new ConjuntoLibros("Mi conjunto de libros");

		Libro l = new Libro ("Lo que el viento se llevó", "Cervantes", 300, 10);
		Libro l2 = new Libro ("El Diario de Anna Frank", "Anna Frank", 230, 15);
		Libro l3 = new Libro ("La ladrona de libros", "Markus Zusak", 154, 4);
		Libro l4 = new Libro ("La Sirenita", "Markus Zusak", 154, 1);
		
		conjunto.addcoleccion(l);
		conjunto.addcoleccion(l2);
		conjunto.addcoleccion(l3);
		System.out.println("=======================================");
		System.out.println("Conjunto de libros");
		System.out.println("=======================================");
		conjunto.imprimir(conjunto.getLibros());
		System.out.println("=======================================");
		System.out.println("Lista con el libro añadido");
		System.out.println("=======================================");
		conjunto.addLibro(l4);
		conjunto.imprimir(conjunto.getLibros());
		System.out.println("=======================================");
		System.out.println("Lista con el libro borrado por autor");
		System.out.println("=======================================");
		conjunto.borrarAutor("Anna Frank");
		conjunto.imprimir(conjunto.getLibros());
		
		conjunto.borrarTitulo("Lo que el viento se llevó");
		System.out.println("=======================================");
		System.out.println("Lista con el libro borrado por título");
		System.out.println("=======================================");
		conjunto.imprimir(conjunto.getLibros());
		
		Libro mayornota = conjunto.getMayorNota();
		Libro menornota = conjunto.getMenorNota();
		System.out.println("El libro con la mayor nota es "+mayornota.getTitulo()+" y el libro con menor nota es " +menornota.getTitulo());
	
	}

}
