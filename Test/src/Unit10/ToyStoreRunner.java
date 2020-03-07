package Unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore store = new ToyStore();
		System.out.println(store); 
		
		String toys = "r8 gtr gtr gtr gtr r8 r8 r8 r8 huracan huracan huracan";
		store.loadToys(toys);
		System.out.println(store);
		
		System.out.println(store.getMostFrequentToy());
	}
}