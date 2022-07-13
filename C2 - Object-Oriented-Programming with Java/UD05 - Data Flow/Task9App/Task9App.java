package Task9App;

public class Task9App {

	public static void main(String[] args) {
		// Loop 100 times checking whether the number can be divided by 2 & 3 at the same time
		for (int i = 1; i <= 100; i++)
		{
			if ((i % 2 == 0) && (i % 3 == 0)) 
			{
				System.out.println(i);
			}
		}


	}

}
