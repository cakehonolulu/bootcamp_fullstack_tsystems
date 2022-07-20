package Task1;

public class Task1App {

	public static void main(String[] args) {
//llenar array Electrodomestico con valores
		Electrodomestico[] electrodomesticos = llenarArrayConElectrodomesticos();
//calcular los precios totales de los objetos Lavadora, Television y el total de los electromesticos, 
		// llamando a los metodos necesarios
		int precioTotal = precioElectrodomesticos(electrodomesticos);
		int precioTv = precioTelevisiones(electrodomesticos);
		int precioLavadoras = precioLavadoras(electrodomesticos);
//imprir los resultados obtenidos
		mostrarResult(precioTotal, precioTv, precioLavadoras);

	}

	/***
	 * rellena un array de 10 posiciones
	 * 
	 * @return el array lleno
	 */
	public static Electrodomestico[] llenarArrayConElectrodomesticos() {

		Electrodomestico[] electrodomesticos = null;
		electrodomesticos[0] = new Electrodomestico(120, "bLanco", 'Z', 80);
		electrodomesticos[1] = new Electrodomestico(20, "Negro", 'A', 5);
		electrodomesticos[2] = new Television(250, "amarillo", 'B', 50, 40, true);
		electrodomesticos[3] = new Lavadora(300, "azul", 'C', 150, 40);
		electrodomesticos[4] = new Electrodomestico(60, 25);
		electrodomesticos[5] = new Television();
		electrodomesticos[6] = new Television(500, 60);
		electrodomesticos[7] = new Lavadora();
		electrodomesticos[8] = new Lavadora(400, 160);
		electrodomesticos[9] = new Electrodomestico(100, "ROSA", 'Z', 200);

		return electrodomesticos;
	}

	/***
	 * 
	 * @param elec array de tipo Electrodomestico
	 * @return el precio total de todos los electrodomesticos
	 */
	public static int precioElectrodomesticos(Electrodomestico[] elec) {
		int precioTotal = 0;
		for (int i = 0; i < elec.length; i++) {
			elec[i].precioFinal();
			precioTotal += elec[i].precioBase;
		}
		return precioTotal;
	}

	/***
	 * 
	 * @param elec array de tipo Electrodomestico
	 * @return el precio total de los electrodomesticos de tipo Televisor
	 */
	public static int precioTelevisiones(Electrodomestico[] elec) {
		int precioTotal = 0;
		for (int i = 0; i < elec.length; i++) {
			if (elec[i] instanceof Television) {
				precioTotal += elec[i].precioBase;
			}
		}
		return precioTotal;
	}

	/***
	 * 
	 * @param elec array de tipo Electrodomestico
	 * @return el precio total de los electrodomesticos de tipo Lavadora
	 */
	public static int precioLavadoras(Electrodomestico[] elec) {
		int precioTotal = 0;
		for (int i = 0; i < elec.length; i++) {
			if (elec[i] instanceof Lavadora) {
				precioTotal += elec[i].precioBase;
			}
		}
		return precioTotal;
	}

	/***
	 * imprime precio total de todos los electrodomesticos, precio total de
	 * lavadoras y precio total de televisores
	 * 
	 * @param precioTotal
	 * @param precioTv
	 * @param precioLavadoras
	 */
	public static void mostrarResult(int precioTotal, int precioTv, int precioLavadoras) {
		System.out.println("Precio TVs: " + precioTv + "\nPrecio Lavadoras: " + precioLavadoras
				+ "\nPrecio Electrodomésticos: " + precioTotal);
	}

}
