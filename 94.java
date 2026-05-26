/*
Member Inner Class
95.CAJAPWH one class it contains 2 non static methods having parameter and return type and a private variable and a member inner class which contains one non static method then invoke alla these methods  under main method by provoding dynamic inputs.
NOTE--Access the private variable inside the member inner class*/

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
	boolean m2(byte b)
	{
		System.out.println(b);
		return sc.nextBoolean();
	}
	class Inner
	{
		double m3(short c)
		{
			System.out.println(c);
			System.out.println(pass);
			return sc.nextDouble();
		}
	}
	public static void main(String args[])
	{
		Outer a=new Outer();
		System.out.println(a.m1(sc.nextLong()));
		System.out.println(a.m2(sc.nextByte()));
		Outer.Inner a1=a.new Inner();
		System.out.println(a1.m3(sc.nextShort()));
	}
}
	
		