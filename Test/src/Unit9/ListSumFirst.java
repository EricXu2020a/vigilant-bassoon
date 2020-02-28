package Unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		int zero = ray.get(0);
		int sum = 0;
		for (int x = 0; x<= ray.size()-1; x++)
		{
			if (ray.get(x)>zero )
			{
				sum = sum + ray.get(x);
			}
		}
		if (sum==0)
			return -1;
		else
			return sum;
	}
}