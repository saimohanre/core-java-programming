/*96.CAJAPWH one class it contains  private viable and non static method having paramer and return type inside this class static inner class which contains static and non static methods acces private fileds in these method invoke all the properties under main method of separate clss Test.*/

import java.util.Scanner;
class Outer
{
	static Scanner sc=new Scanner(System.in);
	private String pass=sc.next();
	int m1(long a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	static class Inner
	{
		static double m3(short c)
		{
			System.out.println(c);                    //Outer obj=new Outer();
			System.out.println(new Outer().pass);
			return sc.nextDouble();
		}
		boolean m2(Outer a)
		{
			System.out.println(a.pass);	
			return sc.nextBoolean();
		}

	}
}
class Test
{
	public static void main(String args[])
	{
		Outer a=new Outer();
		System.out.println(a.m1(sc.nextLong()));
		Outer.Inner a1=new Outer.Inner();
		System.out.println(a1.m2(x));
		System.out.println(a1.m3(sc.nextShort()));
	}
}
	
		