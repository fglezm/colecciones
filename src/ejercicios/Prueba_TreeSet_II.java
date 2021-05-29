package ejercicios;

import java.util.*;

public class Prueba_TreeSet_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * TreeSet<String> ordenaPersonas= new TreeSet<String>();
		 * 
		 * ordenaPersonas.add("Sandra");
		 * 
		 * ordenaPersonas.add("Amanda");
		 * 
		 * ordenaPersonas.add("Diana");
		 * 
		 * for(String s:ordenaPersonas) {
		 * 
		 * System.out.println(s);
		 * 
		 * }
		 */

		Articulo primero = new Articulo(1, "Primer Articulo");
		Articulo segundo = new Articulo(2, "Segundo Articulo");
		Articulo tercer = new Articulo(3, "Ese es el Tercer Articulo");

		TreeSet<Articulo> ordenaArticulos = new TreeSet<Articulo>();

		ordenaArticulos.add(tercer);
		ordenaArticulos.add(primero);
		ordenaArticulos.add(segundo);

		for (Articulo art : ordenaArticulos) {

			System.out.println(art.getDescripcion());

		}

		Articulo comparadorArticulos = new Articulo();

		TreeSet<Articulo> ordenaArticulos2 = new TreeSet<Articulo>(comparadorArticulos);

		ordenaArticulos2.add(primero);

		ordenaArticulos2.add(segundo);

		ordenaArticulos2.add(tercer);

		for (Articulo art : ordenaArticulos2) {

			System.out.println(art.getDescripcion());
		}

	}
}

class Articulo implements Comparable<Articulo>, Comparator<Articulo> {

	public Articulo() {

	}

	public Articulo(int num, String desc) {

		numero_articulo = num;

		descripcion = desc;

	}

	@Override
	public int compareTo(Articulo o) {
		// TODO Auto-generated method stub
		return numero_articulo - o.numero_articulo;
	}

	public String getDescripcion() {

		return descripcion;

	}

	private int numero_articulo;

	private String descripcion;

	@Override
	public int compare(Articulo arg0, Articulo arg1) {
		// TODO Auto-generated method stub
		String descripcionA = arg0.getDescripcion();

		String descripcionB = arg1.getDescripcion();

		return descripcionA.compareTo(descripcionB);
	}

}
