/*cjwwh one class static method m1 having interger array as parameter and returns nothing and tries Arithmetic array index of bound of exception and hadle it then invoke this main method under main method by providing dynamic input.*/ 

import java.util.Scanner;
class D
{
	static Scanner sc=new Scanner(System.in);
	static void m1(int s[])
	{
		int n=s.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(s[i]);
		}
		try
		{
			System.out.println(s[n+2]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.print(e);
		}
	}	
	public static void main(String[] args)
	{
		int n=sc.nextInt();
		int s[]=new int [n];
		for(int i=0;i<n;i++)			//int a[]={10,20,30,40,50}	
		{
			s[i]=sc.nextInt();
		}
		m1(s);
	}
}