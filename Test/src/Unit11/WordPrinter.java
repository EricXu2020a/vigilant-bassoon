package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class WordPrinter
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printWord(String word, int times)
	{
		for (int x = 1; x<=times; x++)
		{
			System.out.println(word);
		}
	}
}