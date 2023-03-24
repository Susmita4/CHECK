
public class factorial {
	public static void main(String[] args)
	{	final int NUM_FACTS = 10;
		for(int i = 0; i < NUM_FACTS; i++)
			System.out.println( i + "! is " + factorial(i));
	}
	
	public static int factorial(int n)
	{	int result1 = 1;
		for(int i = 2; i <= n; i++)
			result1 *= i;
		return result1;
	}

}
