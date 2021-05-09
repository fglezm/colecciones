package ejercicios;

import java.util.*;

public class Prueba_TreeSet {

	public static void main(String[] args) {
		/* TreeSet que ordena por defecto
		 * TreeSet<String> ordenaPersonas=new TreeSet<String>();
		ordenaPersonas.add("Sandra");
		ordenaPersonas.add("Amanda");
		ordenaPersonas.add("Dianaa");
		for (String s: ordenaPersonas){
			System.out.println(s);
		}*/
		//otro TreeSet que alamacena objetos creados por nosotros de tipo artículo y el ordenamiento por nº artículo
		Articulo primero=new Articulo(1,"Primer artículo");
		Articulo segundo=new Articulo(200,"Segundo artículo");
		Articulo tercer=new Articulo(3,"Terer artículo");
		TreeSet<Articulo> ordenaArticulos=new TreeSet<Articulo>();
		ordenaArticulos.add(tercer);
		ordenaArticulos.add(primero);
		ordenaArticulos.add(segundo);
		for(Articulo art:ordenaArticulos) {
			System.out.println(art.getDescripcion());
		}
	
	
	Articulo comparadorArticulos=new Articulo();
	
	TreeSet<Articulo> ordenaArticulos2=new TreeSet<Articulo>(comparadorArticulos);
	
	ordenaArticulos2.add(primero);
	ordenaArticulos2.add(segundo);
	ordenaArticulos2.add(tercer);
	
	for(Articulo art: ordenaArticulos2){
		System.out.println(art.getDescripcion());
	}
	
	}
}

class Articulo implements Comparable<Articulo>,Comparator<Articulo>	{
	public Articulo() {
		
	}
	public Articulo(int num, String desc) {
		numero_articulo=num;
		descripcion=desc;
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
	public int compare(Articulo o1, Articulo o2) {
		// TODO Auto-generated method stub
		String descripcionA=o1.getDescripcion();
		String descripcionB=o2.getDescripcion();
		return descripcionA.compareTo(descripcionB);
	}
}