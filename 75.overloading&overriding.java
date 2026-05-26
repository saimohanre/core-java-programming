/*cjawwneed to satisfy booth overloading and overriding .*/

import java.util.Scanner;
class D
{
	static Scanner sc=new Scanner(System.in);
	void m1(int a)
	{
		System.out.println(a);
	}
	void m1(int a,float b)
	{
		int c=a+(int)b;
		System.out.println(c);
	}
	float m2(boolean a)
	{
		System.out.println(a);
	}
}
class E extends D
{
	static Scanner sc=new Scanner(System.in);
	void m1(int a)
	{
		System.out.println(a);
		super.m1(sc.nextInt());
	}
	float m2(boolean a)
	{
		System.out.println(a);
		super.m2(sc.nextBoolean());
	}
	public static void main(String[] args)
	{
		E obj=new E();
		obj.m1(sc.nextInt());
		obj.m1(sc.nextInt(),sc.nextFloat());
		obj.m2(sc.nextBoolean());
	}
}