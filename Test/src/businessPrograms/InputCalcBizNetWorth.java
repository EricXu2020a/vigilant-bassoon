package businessPrograms;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;

public class InputCalcBizNetWorth
{
	private static Scanner keyboard;
	
	public static void main (String[] args)
	{
		keyboard = new Scanner(System.in);

		int intAirheadCount, intSourpunchCount;
		
		float floatAirheadUnitValue, floatSourpunchUnitValue;
		


		System.out.print("Enter Airhead inventory count! : ");
		intAirheadCount = keyboard.nextInt();
		System.out.print("Enter unit cost of Airhead!: ");
		floatAirheadUnitValue = keyboard.nextFloat();

		System.out.print("Enter Sourpunch inventory count! : ");
		intSourpunchCount = keyboard.nextInt();
		System.out.print("Enter unit cost of Sourpunch!: ");
		floatSourpunchUnitValue = keyboard.nextFloat();
		
		
		//add in input for all variables

		System.out.println("\n");
		System.out.println("Airhead Inventory Count = " + intAirheadCount);
		System.out.println("Airhead Unit Cost = " + floatAirheadUnitValue);		
		System.out.println("Total Value of Airheads = " + intAirheadCount*floatAirheadUnitValue);
		System.out.println("\n");
		
		System.out.println("Sourpunch Inventory Count = " + intSourpunchCount);
		System.out.println("Sourpunch Unit Cost = " + floatSourpunchUnitValue);
		System.out.println("Total Value of Sourpunch = " + intSourpunchCount*floatSourpunchUnitValue);
		System.out.println("\n");
		
		System.out.println("Overall Inventory Value= " + (intAirheadCount*floatAirheadUnitValue+intSourpunchCount*floatSourpunchUnitValue));
			//add in output for all variables


	}
}
