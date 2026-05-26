import java.util.Scanner;
interface I1
{
	static Scanner sc=new Scanner(System.in);
	int m1(float a);
	default String m2(byte b)
	{
		System.out.println(b);
		return sc.next();
	}
}
interface I2
{
	static Scanner sc=new Scanner(System.in);
	float m3(long c);
	default byte m4(String d)
	{
		System.out.println(d);
		return sc.nextByte();
	}
}
interface I3 extends I1,I2
{
	char m5(float e);
	boolean m6(String f);
}
class A implements I3
{
	static Scanner sc=new Scanner(System.in); 
	public int m1(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	public float m3(long c)
	{
		System.out.println(c);
		return sc.nextFloat();
	}
	public char m5(float e)
	{
		System.out.println(e);
		return sc.next().charAt(0);
	}
	public boolean m6(String f)
	{
		System.out.println(f);
		return sc.nextBoolean();
	}		
	public static void main(String[] args)
	{
		I3 x=new A();
		System.out.println(x.m1(sc.nextFloat()));
		System.out.println(x.m2(sc.nextByte()));
		System.out.println(x.m3(sc.nextLong()));
		System.out.println(x.m4(sc.next()));
		System.out.println(x.m5(sc.nextFloat()));
		System.out.println(x.m6(sc.next()));
	}
}

