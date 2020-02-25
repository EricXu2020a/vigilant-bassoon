package Unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray)
	{
		for (int x = 0; x<numArray.length-1; x++)
		{
			if (numArray.length==1)
				return false;
			if (!(numArray[x]>numArray[x+1]))
			{
				return false;
			}
		}
		return true;
	}	
}