//CCC 2005 J2 RSANumbers
//Description: Given a range of numbers, determine the number of RSA numbers within the range.
//Last Modified: Oct 26, 2022

import java.util.*;

public class RSANumbers
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int min = input.nextInt();
		int max = input.nextInt();
		double root = 0.0; //Square root of the number
		int factors = 2; //Every number has at least 2 factors: 1 and itself
		int num = 0; //Total number of RSA numbers
		
		//Check each number within the range including the max and min
		for (int number = min; number <= max; number++)
		{
			root = Math.sqrt(number);
			
			//Determine if the number is a perfect square
			if (root - Math.floor(root) == 0)
			{
				continue; //A perfect square can't be a RSA number since it has an odd number of distinct factors
			}
			
			//Divide the number by every integer up to its square root
			for (int divisor = 2; divisor <= (int) root; divisor++)
			{
				//Determine if the current divisor is a factor of the number
				if (number % divisor == 0)
				{
					factors += 2; //If the divisor is a factor, the quotient is also a factor
				}
			}
			
			//Determine if the number is a RSA number
			if (factors == 4)
			{
				num++;
			}
			
			factors = 2; //Reset the number of factors
		}
		
		System.out.println("The number of RSA numbers between " + min + " and " + max + " is " + num);
	}
}