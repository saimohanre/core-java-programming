/*85.CAJAWWH one abstract class which contains two abstract methods one defined method and one PC(parameterized constructor) we also have one conceret class which contains two instance variables and two non static methods and one PC then access properties of both the classes into another class test like by providing dynamic inputs.*/

import java.util.Scanner;
abstract class D
{
	static Scanner sc=new Scanner(System.in);	
	abstract int m1(float a);
	abstract boolean m2(String b);
	static long  m3(byte c)
	{
		System.out.println(c);
		return sc.nextLong();
	}
	D(int a)
	{
		System.out.println(a);
	}
}
class E extends D
{
	float c=sc.nextFloat();
	String f=sc.next();
	int m1(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	boolean m2(String b)
	{
		System.out.println(b);
		return sc.nextBoolean();
	}
	byte m4(int e)
	{
		System.out.println(e);
		return sc.nextByte();
	}
	E(String g)
	{
		System.out.println(g);
		super(sc.nextInt());
	}
}
class test
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		D x=new E(sc.next());
		System.out.println(x.m1(sc.nextFloat()));
		System.out.println(x.m2(sc.next()));
		System.out.println(x.m3(sc.nextByte()));
		E x1=(E)x;      //down casting
		System.out.println(x1.c);
		System.out.println(x1.f);
		System.out.println(x1.m4(sc.nextInt()));
	}
}
		