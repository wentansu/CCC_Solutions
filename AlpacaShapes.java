//An Animal Contest 1 P1 AlpacaShapes
//Description: Given the side length and radius, determine whether the square or circle is bigger.
//Last Modified: Oct 27, 2022

import java.util.*;

public class AlpacaShapes
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int s = input.nextInt();
		int r = input.nextInt();
		
		//Compare the area of the square and circle
		if (Math.pow(s, 2) > 3.14 * Math.pow(r, 2))
		{
			System.out.println("SQUARE");
		}
		else
		{
			System.out.println("CIRCLE");
		}
	}
}