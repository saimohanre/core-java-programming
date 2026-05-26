import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	long b=sc.nextLong();
	byte m1(float c)
	{
		System.out.println(c);
		return sc.nextByte();
	}
	long m2(String d)
	{
		System.out.println(d);
		return sc.nextLong();
	}
	A()
	{
		System.out.println("default constructor");
	}
	A(int a,float b)
	{
		System.out.println(a+" "+b);
	}
}
class F extends A

{
	String f=sc.next();
	float i=sc.nextFloat();
	float m1(byte d)
	{
		System.out.println(d);
		System.out.println(super.m1(sc.nextFloat()));
		return sc.nextFloat();
	}2
	char m2(int s)
	{
		System.out.println(s);
		System.out.println(super.m2(sc.next()));
		return sc.next().charAt(0);

	}
	F()
	{
		System.out.println("hello boys");
	}
	F(String e)
	{
		System.out.println(e);
	}
	public static void main(String[] args)
	{
		 F obj=new F();
		new A(sc.nextInt(),sc.nextFloat());
		new F(sc.next());
		System.out.println(obj.m1(sc.nextByte()));
		System.out.println(obj.m2(sc.nextInt()));
	}	 		
}
	
