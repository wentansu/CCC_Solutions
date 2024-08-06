//CCC 2013 J4 Time On Task
//Description: Find the maximum number of chores that can be done in a given period of time.
//Last Modified: Oct 27, 2022

import java.util.*;

public class TimeOnTask
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt(); //Total time given
		int c = input.nextInt(); //Number of chores to choose from
		ArrayList<Integer> chores = new ArrayList<Integer>(c);
		int total = 0; //Total time needed to do some chores
		int num = 0; //Number of chores that can be done
		
		for (int i = 0; i < c; i++)
		{
			chores.add(input.nextInt());
		}
		
		Collections.sort(chores); //Sort all chores from shortest to longest
		
		while (true)
		{
			total += chores.get(0); //Do the shortest chores
			
			//Determine if the total time needed exceeds limit
			if (total > t)
			{
				break;
			}
			
			chores.remove(0); //Remove the chores after it's done
			num++; //Update the number of chores done
		}
		
		System.out.println(num);
	}
}