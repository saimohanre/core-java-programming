/*cjawwhave one class where we get three different types exception and handle any one of them*/

import java.util.*;
class F
{
	static Scanner sc=new Scanner(System.in);
	static F x;
	int g=sc.nextInt();
	public static void main(String[] args)
	{
		try
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			String s=sc.next();
			int d=Integer.parseInt(s);
			System.out.println(d);
			System.out.println(a/b);
			System.out.print(x.g);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
	}
}