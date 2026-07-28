/*81.cjawwhave one abstract method ,one defined method and two single parametrized constructer inherit this class into concert class provide implemetion for abstract classs invoke alla tha  properties  main method.*/
 

import java.util.Scanner;
abstract classs D
{
	abstract int m1(Boolean a);
	static string m2(long b)
	{
		System.out.println(b);
		return sc.next());
	}
	D(String c)
	{
		this(sc.nextFloat());
		System.out.println(c);
	}
	D(float d)
	{
		System.out.println(d);
	}
}
class F extends D
{
	static Scanner sc=D.sc;
	int m1(Boolean a)
	{
		System.out.println(a);
	}
	F()
	{
		super(sc.next());
	}
	public static void main(String[] args)
	{
		F obj=new F();	
		System.out.println(obj.m1(sc.nextBoolean()));
		System.out.println(m2(sc.nextLong()));
	}
}
		
		