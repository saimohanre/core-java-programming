/*cjawwhave two interface which constains one abstract method and one defined method in each also
ona abstract class which contain one abstract method and one defined method one pc then inherit this to interface abstract class into concret class provide imeplemtion for all properties under main method by providing dynamic inputs.*/

import java.util.Scanner;
interface I1
{
	static Scanner sc=new Scanner(System.in);
	int m1(float a);
	default String m2(boolean b)
	{
		System.out.println(b);
		return sc.next();
	}
}
interface I2
{
	static Scanner sc=new Scanner(System.in);
	float m3(String c);
	default  long m4(byte d)
	{
		System.out.println(d);
		return sc.nextLong();
	}
}
abstract class D implements I1
{
	static Scanner sc=new Scanner(System.in);
	abstract byte m5(long e);
	char m6(int f)
	{
		System.out.println(f);
		return sc.next().charAt(0);
	}
	D(int g)
	{
		System.out.println(g);
	}
}
class G extends D implements I2,I1
{
	static Scanner sc=new Scanner(System.in);
	byte m5(long e)
	{
		System.out.println(e);
		return sc.nextByte();
	}
	public float m3(String c)
	{
		System.out.println(c);
		return sc.nextFloat();
	}
	public int m1(float a)
	{
		System.out.println(a);	
		return sc.nextInt();
	}
	G()
	{
		super(sc.nextInt());
	}
	public static void main(String[] args)
	{
		G x=new G();
		System.out.println(x.m1(sc.nextFloat()));
		System.out.println(x.m2(sc.nextBoolean()));
		System.out.println(x.m3(sc.next()));
		System.out.println(x.m4(sc.nextByte()));
		System.out.println(x.m5(sc.nextLong()));
		System.out.println(x.m6(sc.nextInt()));
	}
}




















	


