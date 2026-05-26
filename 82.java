/*82.cjwwhave one obstract class and one abstract method and one defined method and one single parama inherit this calss into concert class provide implementation for abstract class invoke this mian method.
note:call the super class constructor with out explicitly using .*/

import java.util.Scanner;
abstract class F
{
	static Scanner sc=new Scanner(System.in);
	abstract int m1(String a);
	
	Boolean m2(byte b)
	{
		System.out.println(b);
		return sc.nextBoolean();
	}
	F()
	{
		this(sc.nextFloat());	
	}
	F(float c)
	{
		System.out.println(c);
	}
}
class D extends F
{
	static Scanner sc=F.sc;
	int m1(String a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	public static void main(String[] args)
	{
		D obj=new D();
		System.out.println(obj.m1(sc.next()));
		System.out.println(obj.m2(sc.nextByte()));
	}
}

