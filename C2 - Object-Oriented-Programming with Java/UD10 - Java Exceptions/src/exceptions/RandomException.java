package exceptions;

public class RandomException extends Exception{
	public String mensaje;
	


	public RandomException(String mensaje) {
//		super();
		this.mensaje="El numero es " + mensaje;
		
	}
	
	public String getMessage() {
		return mensaje;
	}
}
