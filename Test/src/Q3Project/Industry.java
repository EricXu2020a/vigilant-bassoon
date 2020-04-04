package Q3Project;
import java.util.Scanner;
import static java.lang.System.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Industry
{
	private String name;
	//private Student[] studentList;
	private ArrayList<Stock> stockList;
	
	public Industry()
	{
		name="";
		stockList=new ArrayList<Stock>();
	}
	
	public Industry(String name, int stockCount)
	{
		this.name=name;
		stockList=new ArrayList<Stock>();		
	}
	
	public void addStock(int stockNum, Stock s)
	{
		stockList.add(s);
	}
	
	public void sort()
	{
		Collections.sort(stockList);   //works find now that Student implements Comparable
	}	
	
	public String getIndustryName()
	{
	   return name;	
	}
	
	public double getIndustryAverage()
	{
		double industryAverage=0.0;
		for(Stock s : stockList)
		{
			industryAverage=industryAverage+s.getAverage();
		}
		return industryAverage/stockList.size();
	}
	
	public double getStockAverage(int stockNum)
	{
		return stockList.get(stockNum).getAverage();
	}

	public double getStockAverage(String stockName)
	{
		for(Stock s : stockList)
		{
		   if(s.getName().equals(stockName))
		      return s.getAverage();
		}
		return 0.0;
	}
	
	public String getStockName(int stockNum)
	{
		return stockList.get(stockNum).getName();
	}

	public String getStockWithHighestAverage()
	{
		return stockList.get(stockList.size()-1).getName();
	}

	public String getStockWithLowestAverage()
	{
		return stockList.get(0).getName();
	}
	
	public String toString()
	{
		String output=""+getIndustryName()+"\n";
		for(Stock s : stockList)
		{
			output+=s+"\t"+String.format("%.2f",s.getAverage())+"\n";
		}
		return output;
	}  	
}