import java.util.Scanner;
class X
{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	float m1(Boolean a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
}
class Y extends X
{
	static String m2(byte b)
	{
		System.out.println(b);
		return sc.next();
	}
	boolean m3(long c)
	{
		System.out.println(c);
		return sc.nextBoolean();
	}
}
class Z extends Y
{
	double e=sc.nextDouble();
	byte m4(String d)
	{
		System.out.println(d);
		return sc.nextByte();
	}
	public static void main(String[] args)
	{
		Z a=new Z();
		System.out.println(a.a+" "+a.e);
		System.out.println(a.m1(sc.nextBoolean()));
		System.out.println(m2(sc.nextByte()));
		System.out.println(a.m3(sc.nextLong()));
		System.out.println(a.m4(sc.next()));
	}
}
		
		