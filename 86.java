/*86.cjawwh one abstract class which contain two abstract methods one defined method and one pc then inherit this abstract class three concret classes like a,b,c provide implementation in each class invoke all the properties under main of separate class like test.according to the user choice by using upcasting.*/

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
class A extends D
{
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
	A()
	{
		super(sc.nextInt());
	}

}
class B extends D
{
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
	B()
	{
		super(sc.nextInt());
	}
}
class C extends D
{
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
	C()
	{
		super(sc.nextInt());
	}
}
class test
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 for A/2 for B/3 for C");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
				D x=new A();
				System.out.print(x.m1(sc.nextFloat()));
				System.out.println(x.m2(sc.next()));
				System.out.println(m3(sc.nextByte()));
				break;
			case 2:
				D x1=new B();
				System.out.print(x1.m1(sc.nextFloat()));
				System.out.println(x1.m2(sc.next()));
				System.out.println(m3(sc.nextByte()));

				break;

			case 3:
				D v=new C();
				System.out.print(v.m1(sc.nextFloat()));
				System.out.println(v.m2(sc.next()));
				System.out.println(m3(sc.nextByte()));

				break;

			default:
				System.out.print("invalid input");
		}
	}
}



				
		

		

