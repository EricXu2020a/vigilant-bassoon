package Q3Project;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;

public class Prices
{
	private ArrayList<Double> prices;
	
	public Prices()
	{
		setPrices("");
	}
	
	public Prices(String priceList)
	{
		setPrices(priceList);		
	}
	
	public void setPrices(String priceList)
	{
		Scanner chop = new Scanner(priceList);
		prices = new ArrayList<Double>();
		int size = chop.nextInt();
		chop.next();
		for(int i=0; i<size; i++)
		{
			prices.add(chop.nextDouble());
		}		
	}
	
	public void setPrice(int spot, double price)
	{
		prices.set(spot,price);
	}
	
	public double getSum()
	{
		double sum=0.0;
		for(double price : prices)
		{
			sum=sum+price;
		}
		return sum;
	}
	
	public double getLowPrice()
	{
		if(prices.size()==0)
			return 0.0;		
		double low = prices.get(0);
		for(double price : prices)
		{
			if(low>price)
			  low=price;			   
		}
		return low;
	}
	
	public double getHighPrice()
	{
		if(prices.size()==0)
			return 0.0;
		double high = prices.get(0);
		for(double price : prices)
		{
			if(high<price)
			  high=price;			   
		}
		return high;
	}
	
	public int getNumPrices()
	{
		return prices.size();
	}
	
	public String toString()
	{
		String output="";
		for(double price : prices)
		{
			output+=price+" ";
		}
		return output;
	}	
}