package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   	public Perfect()
   	{
   		setNumber(0);
   	}
   	public Perfect(int num)
   	{
   		setNumber(num);
   	}
	//add a set method
   	public void setNumber(int num)
   	{
   		number = num;
   	}
	public boolean isPerfect()
	{
		int count = 0;
		
		for (int x = 1; x < number; x++)
		{
			if (number%x==0)
			{
				count = count + x;
			}
		}
		
		if (count == number) {
			return true;
		}
		return false;
		
	}
	
	public String toString()
	{
		if (isPerfect()==true)
		{
			return number + " is perfect.";
		}
		return number + " is not perfect.";
	}
	//add a toString	
	
}