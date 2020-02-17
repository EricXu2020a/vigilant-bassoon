package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		//add test cases	
		Word test1 = new Word("Hello");
		System.out.println(test1.getFirstChar());
		System.out.println(test1.getLastChar());
		System.out.println(test1.getBackWards());
		System.out.println("Hello");
		System.out.println();
		System.out.println();

		Word test2 = new Word("World");
		System.out.println(test2.getFirstChar());
		System.out.println(test2.getLastChar());
		System.out.println(test2.getBackWards());
		System.out.println("World");
		System.out.println();
		System.out.println();
		
		Word test3 = new Word("JukeBox");
		System.out.println(test3.getFirstChar());
		System.out.println(test3.getLastChar());
		System.out.println(test3.getBackWards());
		System.out.println("JukeBox");
		System.out.println();
		System.out.println();
		
		Word test4 = new Word("TCEA");
		System.out.println(test4.getFirstChar());
		System.out.println(test4.getLastChar());
		System.out.println(test4.getBackWards());
		System.out.println("TCEA");
		System.out.println();
		System.out.println();
		
		Word test5 = new Word("UIL");
		System.out.println(test5.getFirstChar());
		System.out.println(test5.getLastChar());
		System.out.println(test5.getBackWards());
		System.out.println("UIL");
		System.out.println();
		System.out.println();
				
	}
}