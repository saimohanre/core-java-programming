import java.util.Scanner;
class R3
{
	static Scanner sc=new Scanner(System.in);
	static int m1(boolean a)
	{
		System.out.println(a);
		System.out.println("enter the ineteger value");
		return sc.nextInt();
	}
	 static float m2(long c)
	{
		System.out.println(c);
		System.out.println("enter the boolean value");
		System.out.println(m1(sc.nextBoolean()));
		System.out.println("enter the float value");
		return sc.nextFloat();
	}
	static double m3(int d)
	{
		System.out.println(d);
		System.out.println("enetr the long value");
		System.out.println(m2(sc.nextLong()));
		return sc.nextDouble();
	}
	static int m4(float m)
	{
		System.out.println(m);
		System.out.println("enter the integer value");
		System.out.println(m3(sc.nextInt()));
		System.out.println("enter the integer value");
		return sc.nextInt();
	}
	public static void main(String[] args)
	{
		System.out.println("enetr the float value");
		System.out.println(m4(sc.nextFloat()));
	}
}