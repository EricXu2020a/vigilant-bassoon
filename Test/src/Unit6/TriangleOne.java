package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		setWord("");
	}

	public TriangleOne(String s)
	{
		setWord(s);
	}

	public void setWord(String s)
	{
		word = s;
	}

	public void print( )
	{	
		for (int x = word.length(); x > 0; x--)
		{
			word =  word.substring(0,x);
			System.out.println(word);
			
		}
	}
}