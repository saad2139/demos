package assignment1;

public class Question6
{
	// Write a program to determine if an integer is even without using the modulus operator.
	public static void main(String[] args)
	{
		// Initialize an integer.
		int n = 19;
		int x = n;
		
		while(x >= 0)
		{
			if(x < 2)
			{
				if(x == 1)
				{
					System.out.println(n + " is not even.");
				}
				if(x == 0)
				{
					System.out.println(n + " is even.");
				}
			}
			x = x-2;
		}
	}
}