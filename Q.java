import java.util.Scanner;
class Q
{
	static Scanner sc=new Scanner(System.in);
	static int m1(float b)
	{
		System.out.println(b);
		System.out.println("enter the integer value");
		return sc.nextInt();
	}
	char m2(Boolean c)
	{
		System.out.println(c);
		System.out.println("enter the character value");
		return sc.next().charAt(0);
	}
	public static void main(String[] args)
	{
		System.out.println("enter the float value");
		System.out.println(m1(sc.nextFloat()));
		Q obj=new Q();
		System.out.println("enter the Boolean value");
		System.out.println(obj.m2(sc.nextBoolean()));
	}
}
		