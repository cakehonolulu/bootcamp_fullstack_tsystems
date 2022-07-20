package Task2;

//implementa la interfaz Entregable
public class Videojuego implements Entregable {
	// atributos
	protected String titulo;
	protected int horasEstimadas;
	protected boolean entregado;
	protected String genero;
	protected String companyia;

//constructor por defecto
	public Videojuego() {
		this.titulo = "";
		this.horasEstimadas = 10;
		this.entregado = false;
		this.genero = "";
		this.companyia = "";
	}

//constructor con 2 atributos por parametro, resto por defecto
	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
		this.genero = "";
		this.companyia = "";
	}

//constructor con todos los atributos,menos entregado, por parametro
	public Videojuego(String titulo, int horasEstimadas, String genero, String companyia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
		this.genero = genero;
		this.companyia = companyia;
	}

	public String getTitulo() {
		return titulo;
	}

//getters y setters
	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public String getCompanyia() {
		return companyia;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setCompanyia(String companyia) {
		this.companyia = companyia;
	}

	// sobreescritura del metodo toStrign()
	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", companyia=" + companyia + "]";
	}

	// Si el objeto que le pasamos por parametros dura más que el de la clase,
	// devolvemos true

	@Override
	public boolean compareTo(Object a) {
		// TODO Auto-generated method stub

		boolean esMasLargo = false;
		if (this.horasEstimadas < ((Videojuego) a).getHorasEstimadas()) {
			esMasLargo = true;
		}

		return esMasLargo;
	}

	// cambia el estado de entregado a true
	public boolean entregar() {
		return true;
	}

	// Cambia el destado de entregado a false
	public boolean devolver() {
		return false;
	}

	// devuelve el estado de entregado
	public boolean isEntregado() {
		return this.entregado;
	}

}
