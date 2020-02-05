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

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(dist,hrs,mins);
		
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours =hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		mph= (double) distance/(hours+(double)minutes/60);
	}

	public void print()
	{
		System.out.print("\n");
		System.out.print(distance + " miles in " + hours + " hour and " + minutes + " minutes = " + Math.round(+mph) + " MPH.");
		System.out.print("\n");
		/*System.out.print(" miles in ");
		System.out.print(+hours);
		System.out.print(" hour and ");
		System.out.print(+minutes);
		System.out.print(" minutes = ");
		System.out.print(Math.round(+mph));
		System.out.println(" MPH.");*/
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "distance miles";
	}
}