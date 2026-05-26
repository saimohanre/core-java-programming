import java.util.Scanner;
class R1
{
	static Scanner sc=new Scanner(System.in);
	int m1(float a)
	{
		System.out.println(a);
		System.out.println("enter the integer value");
		return sc.nextInt();
	}
	 static Boolean m2(long c)
	{
		System.out.println(c);
		R1 sai=new R1\();
		System.out.println("enter the float value");
		System.out.println(sai.m1(sc.nextFloat()));
		System.out.println("enter the boolean value");
		return sc.nextBoolean();
	}
	public static void main(String[] args)
	{
		System.out.println("enetr the long value");
		System.out.println(m2(sc.nextLong()));
	}
}