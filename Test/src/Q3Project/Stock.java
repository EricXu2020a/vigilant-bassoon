package Q3Project;
import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Comparable;

public class Stock implements Comparable<Stock>
{
	private String myName;
	private Prices myPrices;
	
	public Stock()
	{
		setName("");
		setPrices("");
	}
	
	public Stock(String name, String priceList)
	{
		setName(name);
		setPrices(priceList);
	}
	
	public void setName(String name)
	{
		myName=name;
	}	
	
	public void setPrices(String priceList)
	{
		myPrices=new Prices(priceList);		
	}
	
	public void setPrice(int spot, double price)
	{
		myPrices.setPrice(spot,price);
	}

	public String getName()
	{
		return myName;
	}
	
	public int getNumPrices()
	{
		return myPrices.getNumPrices();
	}

	public double getSum()
	{
		return myPrices.getSum();
	}
	
	public double getAverage()
	{
		return getSum()/getNumPrices();
	}

	public double getAverageMinusLow()
	{
		return (myPrices.getSum()-getLowPrice())/(getNumPrices()-1);
	}
	
	public double getHighPrice()
	{
		return myPrices.getHighPrice();		
	}
	
	public double getLowPrice()
	{
		return myPrices.getLowPrice();		
	}
	
	public int compareTo(Stock param)
	{
		if(getAverage()>param.getAverage())
		  return 1;
		else if (getAverage()<param.getAverage())
		  return -1;
		return 0;
	}	
	
	public boolean equals(Object obj)
	{
		return true;
	}
	
	public String toString()
	{
		return myName + " = " + myPrices.toString();
	}	
}