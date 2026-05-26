/*INNER INTERFACE
103.CJAP where we have one interface it contains 2 undefined methods and an inner interface which comtains one undefined method ,then provide functionality and invoke all the properties under main method by provding dynamic inputs.*/

import java.util.Scanner;
interface I1
{
	static Scanner sc=new Scanner(System.in);
	int m1(long a);
	byte m2(Boolean b);
	interface I2
	{
		static Scanner sc=new Scanner(System.in);
		String m3(byte c);
	}
}
class D
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		I1 obj=new I1()
		{
			public int m1(long a)
			{
				System.out.println(a);
				return sc.nextInt();
			}
			public byte m2(Boolean b)
			{
				System.out.println(b);
				return sc.nextByte();
			}
		};
		I1.I2 x=(byte c)->
		{
			System.out.println(c);
			return sc.next();
		};
		System.out.println(obj.m1(sc.nextLong()));
		System.out.println(obj.m2(sc.nextBoolean()));
		System.out.println(x.m3(sc.nextByte()));
	}
}
		
	
		