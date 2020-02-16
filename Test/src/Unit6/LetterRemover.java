package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover("",'a');
	}

	public LetterRemover(String s, char rem)
	{
		setRemover(s,rem);
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		int i = 0;
		while (cleaned.indexOf(lookFor)>=0) {
			//haha accidentaly did "lookFor" instead of variable, spent a good 30 min debugging.
			i=cleaned.indexOf(lookFor);
			cleaned = cleaned.substring(0,i)+cleaned.substring(i+1);
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
		
	}
}