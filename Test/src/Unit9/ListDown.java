package Unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(List<Integer> numArray)
	{
		for (int x = 0; x<=numArray.size()-2; x++)
		{
			if (numArray.get(x)<numArray.get(x+1))
			{
				return false;
			}
		}
		return true;
	}	
}