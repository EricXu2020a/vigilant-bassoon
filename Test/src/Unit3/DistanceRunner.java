package Unit3;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		//add test cases	
		//test1 (1,1,2,1)
		out.println("\n");
		out.println("Enter X1 :: 1");

		out.println("Enter Y1 :: 1");

		out.println("Enter X2 :: 2");
		
		out.println("Enter Y2 :: 1");

		Distance test1 = new Distance(1, 1, 2,1);
		test1.calcDistance();
		test1.print();

		
		//test2 (1,1,-2,2)
		out.println("\n");
		out.println("Enter X1 :: 1");

		out.println("Enter Y1 :: 1");

		out.println("Enter X2 :: -2");
		
		out.println("Enter Y2 :: 2");

		Distance test2 = new Distance(1, 1, -2,2);
		test2.calcDistance();
		test2.print();
		
		
		//test3 (1,1,0,0)
		out.println("\n");
		out.println("Enter X1 :: 1");

		out.println("Enter Y1 :: 1");

		out.println("Enter X2 :: 0");
		
		out.println("Enter Y2 :: 0");

		Distance test3 = new Distance(1, 1, 0, 0);
		test3.calcDistance();
		test3.print();

	}
}