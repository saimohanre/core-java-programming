/*one class which contains two abs methods and one defined method then inherit this class into one concrete class, provide implementation for all abs methods and the concrete class contains two defined methods and Invoke all the properties under main method by using upcasting and downcesting principles*/

import java.util.Scanner;
abstract class D
{
	static Scanner sc=new Scanner(System.in);
	abstract int m1(float a);
	abstract Boolean m2(String b);
	static long  m3(byte c)
	{
		System.out.println(c);
		return sc.nextLong();
	}
}
class F extends D
{
	int m1(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	Boolean m2(String b)
	{
		System.out.println(b);
		return sc.nextBoolean();
	}
	public static void main(String[] args)
	{
		D obj=new F();
		F x=(F)obj;
		System.out.println(obj.m1(sc.nextFloat()));
		System.out.println(obj.m2(sc.next()));
		System.out.println(obj.m3(sc.nextByte()));
	}
}
		