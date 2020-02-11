package Unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		//Scanner keyboard = new Scanner(System.in);
		
		//out.print("Enter the original bill amount :: ");
		//double amt = keyboard.nextDouble();
		
		out.println("Enter the original bill amount :: 500");
		out.print("Bill after discount :: ");
		Discount test1 = new Discount(); 
		out.printf("%.2f\n",test1.getDiscountedBill(500));
		out.println("");
		
		out.println("Enter the original bill amount :: 2500");
		out.print("Bill after discount :: ");
		Discount test2 = new Discount(); 
		out.printf("%.2f\n",test2.getDiscountedBill(2500));
		out.println("");

		out.println("Enter the original bill amount :: 4000");
		out.print("Bill after discount :: ");
		Discount test3 = new Discount(); 
		out.printf("%.2f\n",test3.getDiscountedBill(4000));
		out.println("");
		
		out.println("Enter the original bill amount :: 333.333");
		out.print("Bill after discount :: ");
		Discount test4 = new Discount(); 
		out.printf("%.2f\n",test4.getDiscountedBill(333.33));
		out.println("");
		
		out.println("Enter the original bill amount :: 95874.2154");
		out.print("Bill after discount :: ");
		Discount test5 = new Discount(); 
		out.printf("%.2f\n",test5.getDiscountedBill(95874.2154));
		out.println("");
		
		
		

	}
}