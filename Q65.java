
import java.util.Scanner;
class D
{
 	static Scanner sc=new Scanner(System.in);
	static int m1(float b)
	{
		System.out.println(b);
		return sc.nextInt();
	}
}
class B 
{
	static Scanner sc=new Scanner(System.in);
	static D x=new D();
	byte a=sc.nextByte();
	String m2(long c)
	{
		System.out.println(c);
		return sc.next();
	}
	public static void main(String[] args)
	{
		System.out.println(x.m1(sc.nextFloat()));
		B y=new B();
		System.out.println(y.a);
		System.out.println(y.m2(sc.nextLong()));
	}
}