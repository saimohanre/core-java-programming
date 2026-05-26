//76.cjawwhave one class which contatin static method m1 having pararmeters and retun type satisfy both overloading and riding.

import java.util.Scanner ;
class D
{
	static Scanner sc=new Scanner(System.in);
	static String m1(int a)
	{
		System.out.println(a);
		return sc.next();
	}
	static long m1(float a)
	{
		System.out.println(a);
		System.out.println("m1_D");
		return sc.nextLong();	
	}
}
class F extends D
{
	static Scanner sc=new Scanner(System.in);
	static long m1(float a)
	{
		System.out.println(a);
		System.out.println("m1_F");
		return sc.nextLong();
	}
	public static void main(String[] args)
	{	D x=new F();
		System.out.println(x.m1(sc.nextInt()));
		System.out.println(x.m1(sc.nextFloat()));
		
		System.out.println(x.m1(sc.nextFloat()));
	
	}
}
