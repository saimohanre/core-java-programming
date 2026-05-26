/*CJAP where we have one interface it contains 1 abstract method and 1 defined method another interface which contains 2 abstract methods, and an abstract class which contains 1 abstract method,1 defined method and 1 pc provide implementation in all possible ways invoke all properties under main method by providing dynamic inouts.*/

import java.util.Scanner;
interface I1                           //is also called functional interface  because they have only one abstarct method 
{
	static Scanner sc=new Scanner(System.in);
	int m1(float a);
	default long m2(String b)
	{
		System.out.println(b);
		return sc.nextLong();
	}
}
interface I2
{
	static Scanner sc=new Scanner(System.in);
	String m3(double c);
	long m4(int d);
}

abstract class D
{
	static Scanner sc=new Scanner(System.in);
	abstract float m6(boolean f);
	int m7(long g)
	{
		System.out.println(g);
		return sc.nextInt();
	}
	D(float h)
	{
		System.out.println(h);
	}

	public static void main(String args[])
	{
		D obj=new D(sc.nextFloat())
		{
			float m6(boolean f)
			{
				System.out.println(f);
				return sc.nextFloat();
			}
		};
		I2 x=new I2()
		{
			public String m3(double c)
			{
				System.out.println(c);
				return sc.next();
			}
			public long m4(int d)
			{
				System.out.println(d);
				return sc.nextLong();
			}
		};
		I1 y=(float a)->
		{
			System.out.println(a);
			return sc.nextInt();
		};
		System.out.println(y.m1(sc.nextFloat()));
		System.out.println(y.m2(sc.next()));
		System.out.println(x.m3(sc.nextDouble()));
		System.out.println(x.m4(sc.nextInt()));
		System.out.println(obj.m6(sc.nextBoolean()));
		System.out.println(obj.m7(sc.nextLong()));
	}

}
		
			








	