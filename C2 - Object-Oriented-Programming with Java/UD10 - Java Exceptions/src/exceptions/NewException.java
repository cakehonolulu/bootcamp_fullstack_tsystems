package exceptions;

public class NewException extends Exception{

	public NewException() {
		super();
	}
	
	public String getMessage() {
		String mensaje="Error de prueba";
		return mensaje;
	}
	
}
