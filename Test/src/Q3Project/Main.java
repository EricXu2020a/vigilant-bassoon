package Q3Project;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;
import java.io.IOException;

class Main {
  public static void main(String[] args) throws IOException{
		
		Scanner file = new Scanner(new File("src/Q3Project/stockstats.dat"));
		String className = file.nextLine();
		int numStudents = file.nextInt();
		file.nextLine();
		
		Industry theClass = new Industry(className, numStudents);
		
		for(int i=0; i<numStudents; i++)
		{
			String stuName = file.nextLine();
			String gradeList = file.nextLine();			
			theClass.addStock(i,new Stock(stuName, gradeList));
		}
		
		out.println("\n\n"+theClass);
		theClass.sort();

		out.println("\n\n"+theClass);
		out.println("2020 highest stock prices");
		out.println("AAL: $30.67");
		out.println("DAL: $62.13");
		out.println("JBLU: $21.35");
		out.println();
		
		out.println("Stock price decrease based on average calculations");
		out.println("AAL % decrease: 54.32%");
		out.println("DAL % decrease: 46.82%");
		out.println("JBLU % decrease: 50.07%");
		out.println();
		
		out.println("Current prices as of 4/3 market close");
		out.println("AAL: $8.95");
		out.println("DAL: $19.90");
		out.println("JBLU: $7.23");
		out.println();
		
		out.println("Stock price decrease based on current price");
		out.println("AAL % decrease: 70.82%");
		out.println("DAL % decrease: 67.97%");
		out.println("JBLU % decrease: 66.14%");
		out.println();
		
		out.println("Highest Average = " + theClass.getStockWithHighestAverage());
		out.println("Lowest Average = " + theClass.getStockWithLowestAverage());
		
		out.println("Class average = " + theClass.getIndustryAverage());
  }
}