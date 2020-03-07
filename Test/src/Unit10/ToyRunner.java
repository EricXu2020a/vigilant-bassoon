package Unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy test1 = new Toy("Lighting McQueen");
		test1.setCount(200);
		System.out.println(test1);
		
		Toy test2 = new Toy("gi jo bro");
		test2.setCount(15);
		System.out.println(test2);
	}
}