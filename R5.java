import java.util.Scanner;
class R5
{
	static Scanner sc=new Scanner(System.in);
	static int m1(boolean a)
	{
		System.out.println(a);
		System.out.println("enter the ineteger value");
		return sc.nextInt();
	}
	 static void m2(long c)
	{
		System.out.println(c);
		System.out.println("enter the boolean value");
		System.out.println(m1(sc.nextBoolean()));
		
	}
	static double m3()
	{
		System.out.println("hi");
		System.out.println("enetr the long value");
		m2(sc.nextLong());		
		System.out.println("enter the double value"); 
		return sc.nextDouble();
	}
	static void m4()
	{
		System.out.println("man");
		System.out.println("enter the message");
		System.out.println(m3());
	}
	int m5(float b)
	{
		System.out.println(b);
		m4();
		System.out.println("enter the ineger value");
		return sc.nextInt();
	}
	void m6(double e)
	{
		System.out.println(e);
		System.out.println("enter the float value");
		System.out.println(m5(sc.nextFloat()));	
	}
	boolean m7()
	{
		System.out.println("how");
		System.out.println("enetr the double value");
		m6(sc.nextDouble());
		System.out.println("eneter the boolean value");
		return sc.nextBoolean();
	}
	void m8()
	{
		System.out.println("are you");
		System.out.println("enetr the message");
		System.out.println(m7());
	}
	public static void main(String[] args)
	{
		R5 s2=new R5();
		System.out.println("eneter the message");
		s2.m8();
	}
}