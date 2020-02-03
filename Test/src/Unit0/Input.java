package Unit0;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Eric Xu
//Date - due 02/03/2020
//Class - P2 Remington
//Lab  - Unit0 Input


import java.util.Scanner;

public class Input
{
	private static Scanner keyboard;

	public static void main (String[] args)
	{
		keyboard = new Scanner(System.in);

		int intA, intB;
		double doubleA, doubleB;
		float floatA, floatB;
		short shortA, shortB;


		System.out.print("Enter an integer : ");
		intA = keyboard.nextInt();


		System.out.print("Enter an integer : ");
		intB = keyboard.nextInt();

		System.out.print("Enter a decimal (up to 16 decimal digits accuracy): ");
		doubleA = keyboard.nextDouble();
		
		System.out.print("Enter a decimal (up to 16 decimal digits accuracy): ");
		doubleB = keyboard.nextDouble();
		
		System.out.print("Enter a decimal (up to 7 decimal digits accuracy): ");
		floatA = keyboard.nextFloat();
		
		System.out.print("Enter a decimal (up to 7 decimal digits accuracy): ");
		floatB = keyboard.nextFloat();
		
		System.out.print("Enter an integer between [-32767 , 32767] inclusive: ");
		shortA = keyboard.nextShort();
		
		System.out.print("Enter an integer between [-32767 , 321767] inclusive: ");
		shortB = keyboard.nextShort();
		//add in input for all variables


		System.out.println();
		System.out.println("integer A = " + intA );
		System.out.println("integer B = " + intB );
		System.out.println("integer A*B = "+ intA*intB );
		System.out.println("\n");
		
		System.out.println("double A = " + doubleA );
		System.out.println("double B = " + doubleB );
		System.out.println("double A*B = "+ doubleA*doubleB );
		System.out.println("\n");
		
		System.out.println("float A = " + floatA );
		System.out.println("float B = " + floatB );
		System.out.println("float A*B = "+ floatA*floatB );
		System.out.println("\n");
		
		System.out.println("short A = " + shortA );
		System.out.println("short B = " + shortB );
		System.out.println("short A*B = " + shortA*shortB );
		System.out.println("\n");
		//add in output for all variables


	}
}