/*77.cjawwe have one abstract class which contains two abstract method and one parameterized constructor inherit this class into concert class and provide implemetion for all abstract methods invoke this properties under main method.*/

import java.util.Scanner;
abstract class D
{
	static Scanner sc =new Scanner(System.in);
 	abstract int m1(float a);
	abstract long m2(String b);
	D(int a)
	{
		System.out.println(a);
	}
}
class F extends D
{
	static Scanner  sc=D.sc;
	int m1(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	long m2(String b)
	{
		System.out.println(b);
		return sc.nextLong();
	}
	F()
	{
		super(sc.nextInt());
	}
	public static void main(String[] args)
	{
		F obj=new F();
		System.out.println(obj.m1(sc.nextFloat()));
		System.out.println(obj.m2(sc.next()));
	}
}

