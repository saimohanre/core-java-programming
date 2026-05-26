/*where we need to satisfy string index out of bound*/

import java.util.*;
class D
{
	static Scanner sc=new Scanner(System.in);
	static void m1(String s)
	{	
		try
		{
		System.out.println(s.charAt(5));
		}
		catch(StringIndexOutOfBoundsException d)
		{
			System.out.println(d);
		}
	}
	
	public static void main(String[] args)
	{
		m1(sc.next());
		
	}
}
	