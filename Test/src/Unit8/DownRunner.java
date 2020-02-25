package Unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{					
		RayDown test1 = new RayDown();
		int[] arrtest1 = {-99,1,2,3,4,5,6,7,8,9,10,12345};
		System.out.println(test1.go(arrtest1));

		RayDown test2 = new RayDown();
		int[] arrtest2 = {10,9,8,7,6,5,4,3,2,1,-99};
		System.out.println(test2.go(arrtest2));
		
		RayDown test3 = new RayDown();
		int[] arrtest3 = {10,20,30,40,50,-11818,40,30,20,10};
		System.out.println(test3.go(arrtest3));
		
		RayDown test4 = new RayDown();
		int[] arrtest4 = {32767};
		System.out.println(test4.go(arrtest4));
		
		RayDown test5 = new RayDown();
		int[] arrtest5 = {255,255};
		System.out.println(test5.go(arrtest5));
		
		RayDown test6 = new RayDown();
		int[] arrtest6 = {9,10,-88,100,-555,1000};
		System.out.println(test6.go(arrtest6));
		
		RayDown test7 = new RayDown();
		int[] arrtest7 = {10,10,10,11,456};
		System.out.println(test7.go(arrtest7));
		
		RayDown test8 = new RayDown();
		int[] arrtest8 = {-111,1,2,3,9,11,20,30};
		System.out.println(test8.go(arrtest8));
		
		RayDown test9 = new RayDown();
		int[] arrtest9 = {9,8,7,6,5,4,3,2,0,-2,-989};
		System.out.println(test9.go(arrtest9));
		
		RayDown test10 = new RayDown();
		int[] arrtest10 = {12,15,18,21,23,1000};
		System.out.println(test10.go(arrtest10));
		
		RayDown test11 = new RayDown();
		int[] arrtest11 = {250,19,17,15,13,11,10,9,6,3,2,1,-455};
		System.out.println(test11.go(arrtest11));
		
		RayDown test12 = new RayDown();
		int[] arrtest12 = {9,10,-8,10000,-5000,1000};
		System.out.println(test12.go(arrtest12));
	}
}