import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	float m1(Boolean b)
	{
		System.out.println(b);
		return sc.nextFloat();
	}
}
class B extends A
{
	Boolean c=sc.nextBoolean();
	static String m2(byte d)
	{
		System.out.println(d);
		return sc.next();
	}
}
class C extends A
{
	long e=sc.nextLong();
	static float m3(String f)
	{
		System.out.println(f);
		return sc.nextFloat();
	}
	public static void main(String[] args)
	{
		C obj=new C();
		System.out.println(obj.a);
		System.out.println(obj.e);
		System.out.println(obj.m1(sc.nextBoolean()));
		System.out.println(m3(sc.next()));
		B x=new B();
		System.out.println(x.c);
		System.out.println(B.m2(sc.nextByte()));
	}
}
		
