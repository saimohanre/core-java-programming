


import java.uitl.Scanner;
class D
{
 	static Scanner sc=new Scanner(System.in);
	static int m1(float b)
	{
		System.out.println(b);
		return sc.nextInt();
	}
}
class B extends D
{
	byte a=sc.nextByte();
	String m2(long c)
	{
		System.out.println(c);
		return sc.next();
	}
	public static void main(String[] args)
	{
		B y=new B();
		System.out.println(y.m1(sc.nextFloat()));
		System.out.println(y.a);
		System.out.println(y.m2(sc.nextLong()));
	}
}