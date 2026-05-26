/*cjaww nees to satisfy input mis match excetion*/

import java.util.*;
class F
{
	static Scanner sc=new Scanner(System.in);
	static void m1(int a)
	{
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		try
		{
			m1(sc.nextInt());
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}

	}
}