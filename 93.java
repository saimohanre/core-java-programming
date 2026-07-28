/*cjaww three interfaces which contains two abstract methods and one defined method in each then inherit these three uinter faces into one abstract class which contains one abstract method one pc then inherit this class into three concret class provide implementation for all abstract methods another class test which contain ine user defined method binder having abstract class as parameter anssd returns any interface.
here we need to invoke all the properties by using parameter invoke bider method uder main method by passing abstract class object as a parameter according to user choice.*/ 

import java.util.Scanner;
interface I1
{
	static Scanner sc=new Scanner(System.in);
	int m1(float a);
	boolean m7(short g); 
	static String m2(byte b)
	{
		System.out.println(b);
		return sc.next();
	}
}
interface I2
{
	static Scanner sc=new Scanner(System.in);
	float m3(long c);
	String m8(float h);
	static byte m4(String d)
	{
		System.out.println(d);
		return sc.nextByte();
	}
}
interface I3 
{
	static Scanner sc=new Scanner(System.in);
	char m5(float e);
	boolean m6(String f);
	default int m9(long i)
	{
		System.out.println(i);
		return sc.nextInt();
	}
}
abstract class F implements I1,I2,I3
{
	static Scanner sc=new Scanner(System.in);
	abstract int m10(short j);
	F(byte k)
	{
		System.out.println(k);
	}
	public int m1(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	public boolean m7(short g)
	{
		System.out.println(g);
		return sc.nextBoolean();
	}
	public float m3(long c)
	{
		System.out.println(c);
		return sc.nextFloat();
	}
	public String m8(float h)
	{
		System.out.println(h);
		return sc.next();
	}
	public char m5(float e)
	{
		System.out.println(e);
		return sc.next().charAt(0);
	}
	public boolean m6(String f)
	{
		System.out.println(f);
		return sc.nextBoolean();
	}	
}
class D extends F
{
	int m10(short j)
	{
		System.out.println(j);
		return sc.nextInt();
	}
	D()
	{
		super(sc.nextByte());
	}	
}
class E extends F
{
	int m10(short j)
	{
		System.out.println(j);
		return sc.nextInt();
	}
	E()
	{
		super(sc.nextByte());
	}	
}
class G extends F
{
	int m10(short j)
	{
		System.out.println(j);
		return sc.nextInt();
	}
	G()
	{
		super(sc.nextByte());
	}	
}
class Test 
{
	static Scanner sc=new Scanner(System.in);
	I2 binder(F x,int n)
	{
		if(n==1)
		{
		System.out.println(x.m1(sc.nextFloat()));
		System.out.println(I1.m2(sc.nextByte()));
		System.out.println(x.m3(sc.nextLong()));
		System.out.println(I2.m4(sc.next()));
		System.out.println(x.m5(sc.nextFloat()));
		System.out.println(x.m6(sc.next()));
		System.out.println(x.m7(sc.nextShort()));
		System.out.println(x.m8(sc.nextFloat()));
		System.out.println(x.m9(sc.nextLong()));
		System.out.println(x.m10(sc.nextShort()));
		}
		else if(n==2)
		{
		System.out.println(x.m1(sc.nextFloat()));
		System.out.println(I1.m2(sc.nextByte()));
		System.out.println(x.m3(sc.nextLong()));
		System.out.println(I2.m4(sc.next()));
		System.out.println(x.m5(sc.nextFloat()));
		System.out.println(x.m6(sc.next()));
		System.out.println(x.m7(sc.nextShort()));
		System.out.println(x.m8(sc.nextFloat()));
		System.out.println(x.m9(sc.nextLong()));
		System.out.println(x.m10(sc.nextShort()));
		}
		else
		{
		System.out.println(x.m1(sc.nextFloat()));
		System.out.println(I1.m2(sc.nextByte()));
		System.out.println(x.m3(sc.nextLong()));
		System.out.println(I2.m4(sc.next()));
		System.out.println(x.m5(sc.nextFloat()));
		System.out.println(x.m6(sc.next()));
		System.out.println(x.m7(sc.nextShort()));
		System.out.println(x.m8(sc.nextFloat()));
		System.out.println(x.m9(sc.nextLong()));
		System.out.println(x.m10(sc.nextShort()));
		}
		I2 i=(I2)x;
		return i;
	}
	public static void main(String[] args)
	{
		Test obj=new Test();
		System.out.println("1 for D\2 for E\3 for G");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
				F v=new D();
				obj.binder(v,n);
				break;
			case 2:
				F u=new E();
				obj.binder(u,n);
				break;
			case 3:
				F w=new G();	
				obj.binder(w,n);
				break;
			default:
				System.out.println("Invalid input");
		}
	}
}
					
				

		
		


