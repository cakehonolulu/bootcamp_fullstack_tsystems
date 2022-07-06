
public class Task2 {

	public static void main(String[] args) {
		int N = 10;
		double A = 3.1415;
		char C = 'A';
		
		System.out.println("Variable N = " + N);
		System.out.println("Variable A = " + A);
		System.out.println("Variable C = " + C);
		
		// N + A
		System.out.println(N + " + " + A + " = " + (N + A));
		
		// A - N
		System.out.println(A + " - " + N + " = " + (A - N));
		
		// Num. val. variable C
		/*
		 * I'll use type casting to get the integer representation of the character
		 * There are other ways to do so but they haven't been explained yet so I'll stick
		 * with C-style casting. 
		 * */
		System.out.println("Numerical value of the character " + C + " = " + ((int) C));
		
	}

}
