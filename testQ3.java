import java.util.Scanner;
class D
{
	static Scanner sc=new Scanner(System.in);
	long a=sc.nextLong();
	int m1(long a)
	{
		System.out.println(a);
		System.out.println(this.a);
		return sc.nextInt();
	}
	String m2(boolean b)
	{
		System.out.println(b);
		return sc.next();
	}
	D()
	{
		this(sc.nextInt());
		System.out.println("hi");
	}
	D(int a)
	{
		System.out.println(a);
	}
}
class F	extends D
{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	byte m3(String s)
	{
		System.out.println(s);
		return sc.nextByte();
	}
	F()
	{
		super();
	}
	public static void main(String[] args)
	{
		F obj=new F();
		System.out.println(obj.m3(sc.next()));
		System.out.println(obj.m2(sc.nextBoolean()));
		System.out.println(obj.m1(sc.nextLong()));	
	}
}









	