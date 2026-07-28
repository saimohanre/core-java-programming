import java.util.Scanner;
class F
{
	static Scanner sc=new Scanner(System.in);
	static void m1()
	{
		try 
		{
			System.out.println("hello")
		}
		catch(Exception e)
		{	
			System.out.println(e);
		}
		System.out.println("hi");
	}
	public static void main(String[] args)
	{	
		m1();
	}
}

import java.util.Scanner;
class F
{
	static Scanner sc=new Scanner(System.in);
	static int m1()
	{
		try 
		{
			System.out.println("hello");
			return 1;
		}
		catch(Exception e)
		{	
			System.out.println(e);
			return 2;
		}
		System.out.println("hi");
		return 3;
	}
	public static void main(String[] args)
	{	
		m1();
	}
}