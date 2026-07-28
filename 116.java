/*CRJVAP where we have 1 class which contains static method having m1 having 2 integer paramgters then perform division operation with these paramters if any exception occurs then deal with Nullpointerexception.If no exception occurs then deal with Arrayindexoutofbound and iresprective of this exception deal with Inputmismatchexception*/

import java.util.*;
class D
{
	static Scanner sc=new Scanner(System.in);
	static void m1(int a,int b)
	{
		try
		{
			System.out.println(a/b);
			try
			{
				int d[]={1,2,3};
				System.out.print(d[d.length]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			try
			{
				String s=null;
				System.out.println(s.length());
			}
			catch(NullPointerException l)
			{
				System.out.println(l);
			}
			finally
			{
				try
				{
					int f=sc.nextInt();
					System.out.println(f);
				}
				catch(InputMismatchException j)
				{
													j.printStackTrace();
				}
			}	
		}
	}			
	public static void main(String[] args)
	{
		m1(sc.nextInt(),sc.nextInt());
	}
}	
				

		