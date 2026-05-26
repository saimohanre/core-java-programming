import java.util.Scanner;
class R2
{
	static Scanner sc=new Scanner(System.in);
	int m1(boolean a)
	{
		System.out.println(a);
		System.out.println("enter the ineteger value");
		return sc.nextInt();
	}
	 static float m2(long c)
	{
		System.out.println(c);
		R2 sai=new R2();
		System.out.println("enter the boolean value");
		System.out.println(sai.m1(sc.nextBoolean()));
		System.out.println("enter the float value");
		return sc.nextFloat();
	}
	double m3(int d)
	{
		System.out.println(d);
		System.out.println("enetr the long value");
		System.out.println(m2(sc.nextLong()));
		return sc.nextDouble();
	}
	public static void main(String[] args)
	{
		R2 obj=new R2();
		System.out.println("enetr the int value");
		System.out.println(obj.m3(sc.nextInt()));
	}
}