import java.util.Scanner;
class R4
{
	static Scanner sc=new Scanner(System.in);
	static int m1(boolean a)
	{
		System.out.println(a);
		System.out.println("enter the ineteger value");
		return sc.nextInt();
	}
	 float m2(long c)
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
		R4 obj=new R4();
		System.out.println("enetr the long value");
		System.out.println(obj.m2(sc.nextLong()));
		System.out.println("enter the double value"); 		
		return sc.nextDouble();
	}
	int m4(float m)
	{
		System.out.println(m);
		System.out.println("enter the integer value");
		System.out.println(m3(sc.nextInt()));
		System.out.println("enter the integer value");
		return sc.nextInt();
	}
	public static void main(String[] args)
	{
		R4 s2=new R4();
		System.out.println("enetr the float value");
		System.out.println(s2.m4(sc.nextFloat()));
	}
}