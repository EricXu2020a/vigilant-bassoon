package Unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int sum = 0;
		for (int x = 0; x<=ray.length-1; x++)
		{
			if (ray[x]>ray[ray.length-1])
			{
				sum+=ray[x];
			}
		}
		if (sum==0)
			return -1;
		else
		return sum;
	}
}