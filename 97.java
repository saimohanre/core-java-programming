
/*CAJAPWH one class it contains 1 static inner class which contains 1 static and non static methods and a member inner class which contains a non static method, inside this clss we have another member inner class which contains 1 non static method inside thismetod we have local inner class which have non static method ,invoke all these under main methods of separate class Test.*/

import java.util.Scanner;
class F
{
	static Scanner sc=new Scanner(System.in);
	static class Inner
	{
		static int m1(long a)
		{
			System.out.println(a);
			return sc.nextInt();
		}	
		byte m2(String b)
		{
			System.out.println(b);
			return sc.nextByte();
		}
		class Member //member  class
		{
			long m3(short c)
			{
				System.out.println(c);
				return sc.nextLong();
			}
			class Member2 //member class
			{
				char m4(byte d)
				{a
					System.out.println(d);
					class Member3  //local inner class
					{
						int m5(Boolean e)
						{
							System.out.println(e);
							return sc.nextInt();
						}
					}
					Member3 x=new Member3();
					System.out.println(x.m5(sc.nextBoolean()));
					return sc.next().charAt(0);
				}
			}
		}
	}
}
class Test
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		F a=new F(); 
		F.Inner obj=new F.Inner(); 
		System.out.println(obj.m1(sc.nextLong()));   //we can call static method with class name or object of that class like this
F.Inner.(m1(sc.nextLong()));//
		System.out.println(obj.m2(sc.next()));
		F.Inner.Member b=obj.new Member();
		System.out.println(b.m3(sc.nextShort()));
		F.Inner.Member.Member2 c=b.new Member2();
		System.out.println(c.m4(sc.nextByte()));
	}
}
		
			
			
					










