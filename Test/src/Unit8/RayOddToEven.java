package Unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int oddIndex = 0;
		int evenIndex = 0;
		for (int a = 0; a<=ray.length-1; a++)
		{
			if (ray[a]%2==1)
			{
				oddIndex = a;
				for (int b = a; b<=ray.length-1;b++)
				{
					if (ray[b]%2==0)
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