package Unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int oddIndex = 0;
		int evenIndex = 0;
		for (int a = 0; a<=ray.size()-1; a++)
		{
			if (ray.get(a)%2==1)
			{
				oddIndex = a;
				for (int b = ray.size()-1; b>=0;b--)
				{
					if (ray.get(b)%2==0)
					{
						evenIndex = b;
						return evenIndex-oddIndex;
					}
						
				}
			}
		}
			
				
		return -1;
	}
}