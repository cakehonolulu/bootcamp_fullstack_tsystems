package Task3;

public class Task3App {

	public static void main(String[] args) {
//se crean los objetos libro
		Libro libro1 = new Libro("asd123-qwe432", "Cien años de soledad", "Gabriel Garcial Marquez", 606);
		Libro libro2 = new Libro("zxc987-mnb123", "El principe pirata", "Gaelen Foley", 397);
//se muestran por pantalla
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
//se muesta cual tiene mas paginas
		libroConMasPaginas(libro1, libro2);

	}

	/***
	 * 
	 * @param libro1
	 * @param libro2 se comparan los 2 libros pasados por parametro y se imprime el
	 *               que tiene mas paginas
	 */
	public static void libroConMasPaginas(Libro libro1, Libro libro2) {
		if (libro1.getNumPag() > libro2.getNumPag()) {
			System.out.println(libro1.getTitulo() + " tiene más páginas.");
		} else if (libro1.getNumPag() < libro2.getNumPag()) {
			System.out.println(libro2.getTitulo() + " tiene más páginas.");

		} else {
			System.out.println("Los dos libros tienen el mismo nuemero de páginas.");
		}
	}

}
