import java.util.Scanner;
class B
{	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	float m1(Boolean a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
	static String m2(int c)
	{
		System.out.println(c);
		return sc.next();
	}
}
class A extends B
{
	float a=sc.nextFloat();
	char m3(String e)
	{
		System.out.println(e);
		return sc.next().charAt(0);
	}
	public static void main(String[] args)
	{
		A obj=new A();
		System.out.println(obj.a);
		System.out.println(obj.m1(sc.nextBoolean()));
		System.out.println(m2(sc.nextInt()));
		System.out.println(obj.m3(sc.next()));
	}
}

		
		
