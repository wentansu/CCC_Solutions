//CCC 2011 S2 Multiple Choice
//Description: Determine the number of correct answers given the response and answer key.
//Last Modified: Oct 27, 2022

import java.util.*;

public class MultipleChoice
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		String[] response = new String[n];
		String answer = "";
		int c = 0; //Number of correct responses
		
		for (int i = 0; i < n; i++)
		{
			response[i] = input.next();
		}
		
		for (int i = 0; i < n; i++)
		{
			answer = input.next();
			
			//Determine if the response is the same as the answer
			//Don't use ==
			if (response[i].equals(answer))
			{
				c++;
			}
		}
		
		System.out.println(c);
	}
}