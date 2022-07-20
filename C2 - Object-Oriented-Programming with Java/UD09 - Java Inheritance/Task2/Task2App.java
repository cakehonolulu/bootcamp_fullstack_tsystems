package Task2;

public class Task2App {

	public static void main(String[] args) {

		// llena un array de Serie con objetos Serie
		Serie series[] = arrayConSerie();

		// llena un array VIdeojuego
		Videojuego[] videojuegos = arrayConVideojuego();

		// entregar series y videojuegos
		series[0].entregar();
		series[3].entregar();
		videojuegos[1].entregar();
		videojuegos[4].entregar();

		// mostrar la serie con mas temporadas y el videojuego con mas horas
		videojuegoMasLargo(videojuegos);
		serieConMasTemporadas(series);

	}

	/***
	 * declara un array de Serie y se rellena con datos
	 * 
	 * @return el array con datos
	 */
	public static Serie[] arrayConSerie() {
		Serie series[] = { new Serie("harry potter", 2, "comedia", "pepito"), new Serie("love", 4, "drama", "juanito"),
				new Serie("risas y mas risas", 5, "drama", "antonieta"),
				new Serie("con faldas y a lo loco", 6, "historia", "cleopatra"),
				new Serie("animales en la selva", 2, "documental", "fito") };
		return series;
	}

	/***
	 * 
	 * @return array con objetos Serie con valores
	 */
	public static Videojuego[] arrayConVideojuego() {
		Videojuego[] videojuegos = { new Videojuego("Resident Evil: Dead Aim", 67),
				new Videojuego("Animal Crossing", 123, "Sandbox", "Nintendo"), new Videojuego("Project Zomboid", 20),
				new Videojuego("Monster Hunter", 12), new Videojuego("inFamous", 50, "Sandbox", "Sucker Punch") };
		return videojuegos;
	}

	/***
	 * imprime el videojuego con mas horas
	 * 
	 * @param videojuegos array con objetos Viedojuego entre los cual compara e
	 *                    imprime el mas largo
	 */
	public static void videojuegoMasLargo(Videojuego videojuegos[]) {
		int contVid = 0;

		Videojuego masLargo = null;

		for (int i = 0; i < videojuegos.length; i++) {
			if (videojuegos[i].isEntregado()) {
				// System.out.println(videojuegos[i].toString());
				contVid++;
			}

			if (masLargo == null) {
				masLargo = videojuegos[i];
			} else {
				if (!videojuegos[i].compareTo(masLargo)) {
					masLargo = videojuegos[i];
				}

			}
		}

		System.out.println(masLargo.toString());
	}

	/***
	 * 
	 * @param series, array con objetos tipo Serie imprime la serie con mas
	 *                temporadas
	 */
	public static void serieConMasTemporadas(Serie series[]) {
		int contSer = 0;

		Serie MasTemp = null;
		for (int i = 0; i < series.length; i++) {
			if (series[i].isEntregado()) {
				// System.out.println(series[i].toString());
				contSer++;
			}

			if (MasTemp == null) {
				MasTemp = series[i];
			} else {
				if (!series[i].compareTo(MasTemp)) {
					MasTemp = series[i];
				}

			}

		}
		System.out.println(MasTemp.toString());
	}

}
