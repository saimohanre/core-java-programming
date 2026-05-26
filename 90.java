/*cjawwhave one interface which contains two abstract methods one defined method then inherit this interface into one abstract class which contains one abstract method and one pc then inherit this class intherit concret class  provide implemetion for all ABSTRCT METHODS BY PROVIDING DYNAMIC INPUTS*/

import java.util.Scanner;
interface I1
{
	static Scanner sc=new Scanner(System.in);
	int m1(float a);
	float m2(String c);
	default String m3(boolean b)
	{
		System.out.println(b);
		return sc.next();
	}
}
abstract class D implements I1
{
	public int m1(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	public float m2(String c)
	{
		System.out.println(c);
		return sc.nextFloat();
	}
	abstract byte m4(long e);
	D(int f)
	{
		System.out.println(f);
	}
}
class G extends D
{
	byte m4(long e)
	{
		System.out.println(e);
		return sc.nextByte();
	}
	G()
	{
		super(sc.nextInt());
	}
	public static void main(String[] args)
	{
		G x=new G();					//D obj=new G() we give G object to the abstract class
		System.out.print(x.m1(sc.nextFloat()));
		System.out.println(x.m3(sc.nextBoolean()));
		System.out.println(x.m2(sc.next()));
		System.out.println(x.m4(sc.nextLong()));
	}
}	
	
	