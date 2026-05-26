/*cjawwh one interface which two abstract methods and then abstract class which contain two define and one undefine method and a pc then provide functionality for all abstract methods by using an inner calss and invoke them providing dynamic inputs.*/

import java.util.Scanner;
interface I1
{
	static Scanner sc=new Scanner(System.in);
	int m1(long a);
	String m2(boolean b);
}
abstract class D
{
	static Scanner sc=new Scanner(System.in);
	abstract int m3(byte c);
	short m4(double d)
	{
		System.out.println(d);
		return sc.nextShort();
	}
	float m5(int e)
	{
		System.out.println(e);
		return sc.nextFloat();
	}
	D()
	{
		this(sc.nextInt());
	}
	D(int f)
	{
		System.out.println(f);
	}
	public static void main(String[] args)
	{
		D obj=new D()       //or D obj=new D(sc.nextInt());
		{
			int m3(byte c)
			{
				System.out.println(c);
				return sc.nextInt();
			}
		};
		I1 x=new I1()
		{
			public int m1(long a)
			{
				System.out.println(a);
				return sc.nextInt();
			}
			public String m2(boolean b)
			{
				System.out.println(b);	
				return sc.next();
			}
		};
		System.out.println(x.m1(sc.nextLong()));s
		System.out.println(x.m2(sc.nextBoolean()));
		System.out.println(obj.m3(sc.nextByte()));
		System.out.println(obj.m4(sc.nextDouble()));
		System.out.println(obj.m5(sc.nextInt()));
	}
}









			
