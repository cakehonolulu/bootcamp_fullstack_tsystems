
public class Task5 {

	public static void main(String[] args) {
		int A = 10, B = 20, C = 30, D = 40;
		
		System.out.println("A = " + A + "; B = " + B + "; C = " + C + "; D = " + D);
		
		B = C;
		C = A;
		A = D;
		D = B;

		System.out.println("A = " + A + "; B = " + B + "; C = " + C + "; D = " + D);
	}

}
