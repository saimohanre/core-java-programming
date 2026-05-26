/*cjawwh one interface which contains two abstract method two defined method then inherit this interface into one concret class provide implementation for abstract mehod and invoke all the properties under main method by providing dynamic inputs.*/

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
	static long m4(byte e)
	{
		System.out.println(e);
		return sc.nextLong();
	}
}
class D implements I1
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
	public static void main(String[] args)
	{
		D obj=new D();
		System.out.print(obj.m1(sc.nextFloat()));
		System.out.println(obj.m3(sc.nextBoolean()));
		System.out.println(obj.m2(sc.next()));
		System.out.println(I1.m4(sc.nextByte()));
	}
} 
