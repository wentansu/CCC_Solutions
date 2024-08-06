//CCC 2001 J1 Dressing Up with StringBuffer
//Description: Given the height, output a bow tie with asterisks. StringBuffer is used.
//Last Modified: Nov 11, 2022

import java.util.*;

public class DressingUpStringBuffer
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int height = input.nextInt();
		int width = height * 2;
		StringBuffer[] rows = new StringBuffer[(int) (height / 2) + 1]; //An array for all possible rows
		
		//Create each possible row in the bow tie
		for (int i = 1; i <= rows.length; i++)
		{
			StringBuffer row = new StringBuffer(); //StringBuffer is mutable
			int asterisks = i * 2 - 1; //Number of asterisks on each side
			
			//Fill the entire row with asterisks
			for (int j = 0; j < width; j++)
			{
				row.append("*");
			}
			
			//Replace some asterisks with spaces
			for (int j = asterisks; j < width - asterisks; j++)
			{
				row.replace(j, j + 1, " ");
			}
			
			rows[i - 1] = row;
			System.out.println(rows[i - 1]);
		}
		
		//Print the rest of the bow tie by outputting the reverse of the array
		for (int i = rows.length - 2; i >= 0; i--)
		{
			System.out.println(rows[i]);
		}
	}
}