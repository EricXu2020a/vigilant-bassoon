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

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		
		//can enter any values
		out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();
		

		MilesPerHour test = new MilesPerHour(dist, hrs, mins);
		test.calcMPH();
		System.out.println(test);
		
		
		//add more test cases
		
		//test1 for (45,0,32)
		out.println("\n");
		out.println("Enter the distance :: 45");

		out.println("Enter the hours :: 0");

		out.print("Enter the minutes :: 32");
		out.print("\n");
		
		MilesPerHour test1 = new MilesPerHour(45, 0, 32);
		test1.calcMPH();
		System.out.println(test1);

		
		//test2 for (96,1,43)
		out.println("\n");
		out.println("Enter the distance :: 96");

		out.println("Enter the hours :: 1");

		out.print("Enter the minutes :: 43");
		out.print("\n");
		
		MilesPerHour test2 = new MilesPerHour(96,1,43);
		test2.calcMPH();
		System.out.println(test2);

		
		//test3 for (100,2,25)
		out.println("\n");
		out.println("Enter the distance :: 100");

		out.println("Enter the hours :: 2");

		out.print("Enter the minutes :: 25");
		out.print("\n");
		
		MilesPerHour test3 = new MilesPerHour(100,2,25);
		test3.calcMPH();
		System.out.println(test3);

		
		//test4 for (50,2,25)
		out.println("\n");
		out.println("Enter the distance :: 50");

		out.println("Enter the hours :: 2");

		out.print("Enter the minutes :: 25");
		out.print("\n");

		MilesPerHour test4 = new MilesPerHour(50,2,25);
		test4.calcMPH();
		System.out.println(test4);

	}
}