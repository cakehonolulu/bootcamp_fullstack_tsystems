package ex2;

import java.util.ArrayList;

public class ListaPeliculas {
	
	ArrayList<String> peliculas = new ArrayList<String>();
	
	public ListaPeliculas() {}
	
	public void anadePelicula(String peli) {
		peliculas.add(peli);
	}

	public ArrayList<String> getPeliculas() {
		return peliculas;
	}
}
