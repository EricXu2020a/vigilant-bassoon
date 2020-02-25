package Unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumLastRunner
{
	public static void main( String args[] )
	{			
		RaySumLast test1 = new RaySumLast();
		int[] arrtest1 = {-99,1,2,3,4,5,6,7,8,9,10,5};
		System.out.println(test1.go(arrtest1));

		RaySumLast test2 = new RaySumLast();
		int[] arrtest2 = {10,9,8,7,6,5,4,3,2,1,-99};
		System.out.println(test2.go(arrtest2));
		
		RaySumLast test3 = new RaySumLast();
		int[] arrtest3 = {10,20,30,40,50,-11818,40,30,20,10};
		System.out.println(test3.go(arrtest3));
		
		RaySumLast test4 = new RaySumLast();
		int[] arrtest4 = {32767};
		System.out.println(test4.go(arrtest4));
		
		RaySumLast test5 = new RaySumLast();
		int[] arrtest5 = {255,255};
		System.out.println(test5.go(arrtest5));
		
		RaySumLast test6 = new RaySumLast();
		int[] arrtest6 = {9,10,-88,100,-555,2};
		System.out.println(test6.go(arrtest6));
		
		RaySumLast test7 = new RaySumLast();
		int[] arrtest7 = {10,10,10,11,456};
		System.out.println(test7.go(arrtest7));
		
		RaySumLast test8 = new RaySumLast();
		int[] arrtest8 = {-111,1,2,3,9,11,20,1};
		System.out.println(test8.go(arrtest8));
		
		RaySumLast test9 = new RaySumLast();
		int[] arrtest9 = {9,8,7,6,5,4,3,2,0,-2,6};
		System.out.println(test9.go(arrtest9));
		
		RaySumLast test10 = new RaySumLast();
		int[] arrtest10 = {12,15,18,21,23,1000};
		System.out.println(test10.go(arrtest10));
		
		RaySumLast test11 = new RaySumLast();
		int[] arrtest11 = {250,19,17,15,13,11,10,9,6,3,2,1,-455};
		System.out.println(test11.go(arrtest11));
		
		RaySumLast test12 = new RaySumLast();
		int[] arrtest12 = {9,10,-8,10000,-5000,-3000};
		System.out.println(test12.go(arrtest12));



	}
}