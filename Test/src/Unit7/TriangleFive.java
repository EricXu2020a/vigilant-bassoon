package Unit7;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		this('A',0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String pattern()
	{
		
		for (int c = amount; c>=1; c--)
		{
		for (int b = 1; b<=c; b++)
		{
		
			for (int a = b; a<=amount; a++)
			{
				if (letter+b>91)
					System.out.print((char)(letter+b-1-26));
				else
				System.out.print((char)(letter+b-1));
			}
		System.out.print(" ");
		}
		System.out.println();
		}
		return "";
	}
	
	public String toString()
	{
		String output= pattern();
		return output;
		
	}
}