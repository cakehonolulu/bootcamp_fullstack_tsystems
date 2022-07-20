package Task3;

public class Libro {
	/*
	 * Atributos de la clase Libro
	 * */
	private String isbn;
	private String titulo;
	private String autor;
	private int numPag;

	/*
	 * constructor por defecto de la clase Lubro
	 * */
	public Libro() {
		this.isbn = "";
		this.titulo = "";
		this.autor = "";
		this.numPag = 0;
	}

	/*
	 * Constructor de libro pasandole todos los parametroa a la hora de usarlo
	 * 
	 * @param isbn		:	ISBN del libro
	 * @param titulo	:	Titulo del libro
	 * @param autor		:	Autor del libro
	 * @param numPag	:	Numero de paginas del libro
	 * */
	public Libro(String isbn, String titulo, String autor, int numPag) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPag = numPag;
	}

	/*
	 * Getters de los atributos de la clase Libro
	 * Devuelven los los atributos de la clase Libro 
	 * */
	public String getIsbn() {
		return isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getNumPag() {
		return numPag;
	}

	/*
	 * Setters de la clase Libro
	 * Asignan los valores a cada atributo de la clase Libro
	 * */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}

	
	/*
	 * metodo toString devuelve los atributos de la clase Libro en formato String
	 * */
	@Override
	public String toString() {
		return "El libro " + titulo + " con ISBN " + isbn + " creado por " + autor + " tiene " + numPag + " páginas.";
	}

}
