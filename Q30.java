import java.util.Scanner;
class Q30
{
	static Scanner sc=new Scanner(System.in);
	static Boolean m1()
	{
		System.out.println("enter the Boolean value");
		return sc.nextBoolean();
	}
	int m2(float b)
	{
		System.out.println(b);
		System.out.println("enter the int value");
		return sc.nextInt();
	}
	long m3(double c)
	{
		System.out.println(c);
		System.out.println("enter the long value");
		return sc.nextLong();
	}
	public static void main(String[] args)
	{
		Q30 obj=new Q30();
		Boolean f =m1();
		if(f==true)
		{
			System.out.println(obj.m2(sc.nextFloat()));
		}
		else
		{
			System.out.println(obj.m3(sc.nextDouble()));
		}
	}
		
}	
		