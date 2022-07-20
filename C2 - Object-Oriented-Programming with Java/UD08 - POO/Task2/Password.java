package Task2;

public class Password {

	int longitud;
	String contraseña;
	final int LONGITUD_POR_DEFECTO = 8;

	public String generarContraseña(int longitud) {
		String diccionario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvxyz" + "0123456789";
		StringBuilder contrasena = new StringBuilder(longitud);

		for (int i = 0; i < longitud; i++) {

			int index = (int) (diccionario.length() * Math.random());

			contrasena.append(diccionario.charAt(index));
		}

		return contrasena.toString();
	}
	
	public Password() {
		this.longitud = LONGITUD_POR_DEFECTO;
		this.contraseña = "";
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generarContraseña(longitud);
	}
	
	
}
