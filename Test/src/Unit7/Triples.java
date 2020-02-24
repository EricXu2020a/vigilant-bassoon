package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 1;
		for (int x = 2; x<=a/2; x++)
		{
			if (a%x==0 && b%x==0 && c%x==0)
				max = x;
		}
		return max;
	}

	public String toString()
	{
		String output="";
		
		
		for (int a = 1; a <= number; a++) {
			for (int b = a + 1; b <= number; b= b+2) {
				for (int c = a + 2; c <= number; c++) {
					if (c%2==0)
					{
						c++;
					}
					if (Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2) && greatestCommonFactor(a,b,c)==1)
					{
						output = output + a + "  " + b + "  " + c + "\n";
					}
				}
			}
		}
		return output;
	}
}