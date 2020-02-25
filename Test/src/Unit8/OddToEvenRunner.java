package Unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		RayOddToEven test1 = new RayOddToEven();
		int[] arrtest1 = {7,1,5,3,11,5,6,7,8,9,10,12345,11};
		System.out.println(test1.go(arrtest1));

		
		RayOddToEven test2 = new RayOddToEven();
		int[] arrtest2 = {11,9,8,7,6,5,4,3,2,1,-99,7};
		System.out.println(test2.go(arrtest2));


		RayOddToEven test3 = new RayOddToEven();
		int[] arrtest3 = {10,20,30,40,5,41,31,20,11,7};
		System.out.println(test3.go(arrtest3));


		RayOddToEven test4 = new RayOddToEven();
		int[] arrtest4 = {32767,70,4,5,6,7};
		System.out.println(test4.go(arrtest4));


		RayOddToEven test5 = new RayOddToEven();
		int[] arrtest5 = {2,7,11,21,5,7};
		System.out.println(test5.go(arrtest5));


		RayOddToEven test6 = new RayOddToEven();
		int[] arrtest6 = {7,255,11,255,100,3,2};
		System.out.println(test6.go(arrtest6));


		RayOddToEven test7 = new RayOddToEven();
		int[] arrtest7 = {9,11,11,11,7,1000,3};
		System.out.println(test7.go(arrtest7));


		RayOddToEven test8 = new RayOddToEven();
		int[] arrtest8 = {7,7,7,11,2,7,7,11,11,2};
		System.out.println(test8.go(arrtest8));


		RayOddToEven test9 = new RayOddToEven();
		int[] arrtest9 = {2,4,6,8,8};
		System.out.println(test9.go(arrtest9));



	}
}