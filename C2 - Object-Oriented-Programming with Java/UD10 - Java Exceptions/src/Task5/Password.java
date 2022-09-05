package Task5;

public class Password {
	private int longitud;
	private String contrasena;

	public Password() {
		this.longitud = 8;
		this.contrasena = "";
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.contrasena = generarPassword(longitud);
	}

	public static String generarPassword(int longitud) {
		String diccionario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvxyz" + "0123456789";
		StringBuilder contrasena = new StringBuilder(longitud);

		for (int i = 0; i < longitud; i++) {

			int index = (int) (diccionario.length() * Math.random());

			contrasena.append(diccionario.charAt(index));
		}

		return contrasena.toString();
	}

	public static boolean esFuerte(String contrasena) {
		int mayus = 0, minus = 0, num = 0;
		boolean fuerte = false;
		
		for (int i = 0; i < contrasena.length(); i++) {
			if ('A' <= contrasena.charAt(i) && 'Z' >= contrasena.charAt(i))
			{
				mayus++;
			} else if ('a' <= contrasena.charAt(i) && 'z' >= contrasena.charAt(i))
			{
				minus++;
			} else if ('0' <= contrasena.charAt(i) && '9' >= contrasena.charAt(i))
			{
				num++;
			}
		}
		
		if (mayus >= 2 && minus >= 1 && num >= 5)
		{
			fuerte = true;
		}
		
		return fuerte;
	}

	public int getLongitud() {
		return longitud;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

}
