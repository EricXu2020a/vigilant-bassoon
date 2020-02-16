package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		
		for (int x = 0; x <= str.length()-2; x++) {
			if (str.substring(x,x+1).contentEquals(str.substring(x+1,x+2)))
				//weird, I typed .equals but it became .contentEquals... coding ghost!? :0
				count++;	
		}
		return count;
	
		
	}
}