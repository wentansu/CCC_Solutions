//CCC 2001 J1 Dressing Up
//Description: Given the height, output a bow tie with asterisks.
//Last Modified: Nov 11, 2022

import java.util.*;

public class DressingUp
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int height = input.nextInt();
		int width = height * 2;
		
		//First part of the bow tie before the middle row
		//Height is also the number of asterisks on each end of the middle row
		for (int i = 1; i < height; i += 2)
		{
			printRow(i, width);
		}
		
		//Rest of the bow tie
		for (int i = height; i >= 1; i -= 2)
		{
			printRow(i, width);
		}
	}
	
	//Print the row given the number of asterisks on each end and the width of the row
	private static void printRow(int asterisks, int width)
	{
		//First set of asterisks
		for (int i = 0; i < asterisks; i++)
		{
			System.out.print("*");
		}
		
		//Spaces in the middle
		//There are width - 2 * number of asterisks spaces
		for (int i = 0; i < width - 2 * asterisks; i++)
		{
			System.out.print(" ");
		}
		
		//Second set of asterisks
		for (int i = 0; i < asterisks; i++)
		{
			System.out.print("*");
		}
		
		System.out.println(); //Move to next line
	}
}