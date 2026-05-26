/*CJAP where we have one class which contains an interface which contains one abstract method one inner class which contains one private variable one pc. provide implementation for abstract method in the inner class and invoke under main method of separate class Test by provding dynamic inputs.*/

import java.util.Scanner;
class D
{
	static Scanner sc=new Scanner(System.in);
	interface I1
	{
		static Scanner sc=new Scanner(System.in);
		int m1(long a);
	}
	class Inner implements I1
	{
		static Scanner sc=new Scanner(System.in);
		private String pass=sc.next();
		Inner(Boolean c)
		{
			System.out.println(c);
		}
		public int m1(long a)
		{
			System.out.println(a);
			return sc.nextInt();
		}
		public String getpass()
		{
			return pass;	
		}
		
		
	}
		
	
}
class Test 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
	D obj=new D();
	D.Inner x=obj.new Inner(sc.nextBoolean());	
	System.out.println(x.m1(sc.nextLong()));
	System.out.println(x.getpass());
	}
}
			