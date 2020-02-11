package Unit4;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	public static double check( double a, double b )
	{
		if(a>b) {
			return (double)a-b;
		}
		if(b>a) {
			return (double)b-a;
		}
		if(a==b) {
			return (double) a*b;
		}
		return 0.0;
	}
	
}