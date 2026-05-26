import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	static int d=sc.nextInt();
	long m1(int b)
	{
		System.out.println(b);
		return sc.nextLong();
	}
	A(int a)
	{
		System.out.println("a");
	}
}
class B extends A
{
	byte a=sc.nextByte();
	String m2(byte c)
	{
		System.out.println(c);
		return sc.next();
	}
	B(float e)
	{
		super(sc.nextInt());
		System.out.println(e);
	}
	public static void main(String[] args)
	{
		B obj=new B(sc.nextFloat());
		System.out.println(obj.a);
		System.out.println(d);
		System.out.println(obj.m1(sc.nextInt()));
		System.out.println(obj.m2(sc.nextByte()));
	}
}
	