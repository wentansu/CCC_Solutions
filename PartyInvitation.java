//CCC 2014 S1 Party Invitation
//Description: Remove a number of people from a list whose positions are multiples of a given number.
//Last Modified: Oct 27, 2022

import java.util.*;

public class PartyInvitation
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int k = input.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>(k);
		
		//Initialize the list with numbers 1 to k
		for (int i = 1; i <= k; i++)
		{
			list.add(i);
		}
		
		int m = input.nextInt(); //Number of rounds
		int r = 0;
		int num = 0; //Number of people to be removed in a round
		
		for (int i = 0; i < m; i++)
		{
			r = input.nextInt();
			num = (int) list.size() / r; //Rounded down
			
			//Use num as the end value because list.size() changes after every iteration of the loop
			for (int j = 1; j <= num; j++)
			{
				list.remove(j * (r - 1)); //Remove the element in the position that is a multiple of r
			}
		}
		
		//Output the remaining list
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
	}
}