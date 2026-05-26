import java.util.Scanner;
class Q31
{
	static Scanner sc=new Scanner(System.in);
	static Q31 obj=new Q31();
	static int m1(float a)
	{
		System.out.println(a);
		System.out.println("enter the integer value");
		return sc.nextInt();
	}
	Boolean m2(double b)
	{
		System.out.println(b);
		System.out.println(m1(sc.nextFloat()));
		System.out.println("enter the Boolean value");
		return sc.nextBoolean();
	}
	static float m3(int c)
	{
		System.out.println(c);
		System.out.println(obj.m2(sc.nextDouble()));
		System.out.println("enter the float value");
		return sc.nextFloat();
	}
	double m4(Boolean d)
	{
		System.out.println(d);
		System.out.println(m3(sc.nextInt()));
		System.out.println("enter the double value");
		return sc.nextDouble();
	}
	public static void main(String[] args)
	{	
		System.out.println("enter the boolean value");
		System.out.println(obj.m4(sc.nextBoolean()));
	}
}
