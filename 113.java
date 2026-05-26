/*cjawwnto handle three different types exceptions in three different ways*/

import java.util.Scanner;
class D
{	static Scanner sc=new Scanner(System.in);
	static void m1(String a)
	{
		System.out.println(a);
	}
	static void m2(int b)
	{
		System.out.println(b);
	}
	static void m3(byte c)
	{
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		try
		{
			m1(sc.nextFloat());
		}
		catch(InputMismsatchException e)
		{
			System.out.println(e);
		}
		try 
		{
			m2(sc.nextLong());
		}
		catch(InputMismatchException d)
		{
			System.out.println( d.getMessage());
		}
		try
		{
			m3(sc.nextFloat());
		}
		catch(InputMismatchException f)
		{
			System.out.println(f.printStrackTrace());
		}
	}
}
					