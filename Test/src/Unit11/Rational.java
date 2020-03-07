package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int top;
	private int bot;
	//write two constructors
	public Rational()
	{
		setRational(0,1);
	}

	public Rational(int t, int b)
	{
		setRational(t,b);
	}

	//write a setRational method
	public void setRational(int t, int b)
	{
		top = t;
		bot = b;
	}

	//write  a set method for numerator and denominator
	public void setNumer(int t)
	{
		top = t;
	}
	
	public void setDenom(int b) 
	{
		bot = b;
	}
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		
		//new numerator = (num1 * den2 + num2 * den1)
		top = (top * other.getDenom()) + (other.getNumer() * bot);
		//new denominator = (den1 * den2)
		bot = bot * other.getDenom();

		reduce();
	}

	private void reduce()
	{
		int gcd = gcd(top, bot);
		
		top /= gcd;
		bot /= gcd;



	}

	private int gcd(int numOne, int numTwo)
	{
		int minimum = Math.min(numOne, numTwo);
		
		for (int i = minimum; i > 1; i--) 
		{
			if (numOne % i == 0 && numTwo % i == 0) 
			{
				return i;
			}
		}
		return 1;
	}

	public Object clone ()
	{
		return new Rational(top, bot);
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNumer() 
	{
		return top;
	}
	
	public int getDenom() 
	{
		return bot;
	}
	
	public boolean equals( Object obj)
	{
		if (top == ((Rational) obj).getNumer() && bot == ((Rational) obj).getDenom())
		{
			return true;
		}

		return false;
	}

	public int compareTo(Rational other)
	{
		if (this.equals(other))
		{
			return 0;
		}
	
		int Top1 = top * other.getDenom();
		int Top2 = other.getNumer() * bot;
		
		if (Top1 > Top2) 
		{
			return 1;
		} else
		return -1;

		
	}



	
	//write  toString() method
	public String toString() 
	{
		return top + " / " + bot;
	}
	
}