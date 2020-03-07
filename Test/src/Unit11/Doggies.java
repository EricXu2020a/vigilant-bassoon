package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new array of Dog
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot
		//make sure spot is in bounds
		if (spot>=0 && spot<=pups.length-1)
		{
			pups[spot] = new Dog(age,name);
		}
		
	}

	public String getNameOfOldest()
	{
		String oldestname = "lol";
		int oldestage = 0;
		for (int x = 0; x <= pups.length-1; x++)
		{
			if (pups[x].getAge() > oldestage)
			{
				oldestage = pups[x].getAge();
				oldestname = pups[x].getName();
			}
		}
		return oldestname;
	}

	public String getNameOfYoungest()
	{
		String youngestname = "lol";
		int youngestage = 100;
		for (int x = 0; x <= pups.length-1; x++)
		{
			if (pups[x].getAge() < youngestage)
			{
				youngestage = pups[x].getAge();
				youngestname = pups[x].getName();
			}
		}
		return youngestname;
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}