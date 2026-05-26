import java.util.Scanner;
class R
{
	static Scanner sc=new Scanner(System.in);
	int m1(float a)
	{
		System.out.println(a);
		System.out.println("enter the integer value");
		return sc.nextInt();
	}
	Boolean m2(long c)
	{
		System.out.println(c);
		System.out.println("enter the float value");
		System.out.println(m1(sc.nextFloat()));
		System.out.println("enter the boolean value");
		return sc.nextBoolean();
	}
	public static void main(String[] args)
	{
		R sai=new R();
		System.out.println("enetr the long value");
		System.out.println(sai.m2(sc.nextLong()));
	}
}