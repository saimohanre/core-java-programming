import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	static String m1(float b)
	{
		System.out.println(b);
		return sc.next();
	}
}
class B extends A
{
	float c=sc.nextFloat();
	int m2(Boolean d)
	{
		System.out.println(d);
		return sc.nextInt();
	}
}
class C extends B
{
	Boolean f=sc.nextBoolean();
	static byte m3(int e)
	{
		System.out.println(e);
		return sc.nextByte();
	}
}
class E extends A
{
	float g=sc.nextFloat();
	char m4(long h)
	{
		System.out.println(h);
		return sc.next().charAt(0);
	}
}
class F extends A
{
	static long i=sc.nextLong();
	int m5(byte j)
	{
		System.out.println(i);
		return sc.nextInt();
	}
	public static void main(String args)
	{
		F obj=new F();
		System.out.println(obj.a);
		System.out.println(i);
		System.out.println(m1(sc.nextFloat()));
		ystem.out.println(obj.m5(sc.nextByte()));
		C y=new C();
		System.out.println(y.c);
		System.out.println(y.f);
		System.out.println(y.m2(sc.nextBoolean()));
		System.out.println(m3(sc.nextInt()));
		E x=new E();
		System.out.println(x.g);
		System.out.println(E.m4(sc.nextLong()));
	}
}
		






		