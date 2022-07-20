package Task2;

//implementa la interfaz ENtregable
public class Serie implements Entregable {
	// atributos
	protected String titulo;
	protected int numTemporadas;
	protected boolean entregado;
	protected String genero;
	protected String creador;

//constructor con todos los atributos, menos entregado pasados por parametro
	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.entregado = false;
		this.genero = genero;
		this.creador = creador;
	}

//constructor con dos atributos pasados por parametro, resto por defecto
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = creador;
	}

//constructor por defecto
	public Serie() {
		this.titulo = "";
		this.numTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}

	// getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	/***
	 * sobreescritura del metodo toString()
	 */
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numTemporadas=" + numTemporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}

	// Si el objeto que le pasamos por parametros tiene mas temporadas que el de la
	// clase, devolvemos true
	@Override
	public boolean compareTo(Object a) {
		// TODO Auto-generated method stub

		boolean esMasLargo = false;
		if (this.numTemporadas < ((Serie) a).getNumTemporadas()) {
			esMasLargo = true;
		}

		return esMasLargo;
	}

	// cambia el estado de entregado a true
	public boolean entregar() {
		return true;
	}

//Cambia el destado de entregado a false
	public boolean devolver() {
		return false;
	}

//devuelve el estado de entregado
	public boolean isEntregado() {

		return this.entregado;
	}

}
