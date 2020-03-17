package DataLab;
/*
 * Arrays of objects
 */
 
import core.data.*;
import java.util.ArrayList;
import java.util.HashMap;

public class UniqueRunner {
	public static void main(String[] args) {
		
		DataSource ds = DataSource.connect("https://data.ct.gov/api/views/rybz-nyjw/rows.xml").load();
		ds.printUsageString();
		ArrayList<Unique> deaths = ds.fetchList(Unique.class, "row/row/fentanyl", "row/row/benzodiazepine");

		
		HashMap<String, String> death = new HashMap<String, String>();

		
		String fentanyl, benzodiazepine;
		
		int f = 0;
		int b = 0;
		
		
		for (Unique a : deaths) 
		{
		
			fentanyl = a.getfentanyl();
			benzodiazepine = a.getbenzodiazepine();
			if (fentanyl.equals("Y"))
				f++;
			if (benzodiazepine.equals("Y"))
				b++;
		}
		System.out.println("Fentanyl deaths: " + f);
		System.out.print("Fentanyl death rate: ");
		System.out.printf("%.2f", (double) f/5106*100);
		System.out.println("%");
		System.out.println("Benzodiazepine deaths: " + b);
		System.out.print("Benzodiazepine death rate: ");
		System.out.printf("%.2f", (double) b/5106*100);
		System.out.println("%");
	}
}