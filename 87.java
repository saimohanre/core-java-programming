/*Create a Java application where we have one abstract class which contains 2 abstract methods, 1 defined method and 1 pc then inherit this class into 2 concrete classes provide implementation and also have 2 non static methods in each. We also have another class Test which contains one user defined method named binder having abstract class object as parameter and returns nothing here, we need to invoke all the properties of both abstract class and conceret class properties and implementation class properties by using upcasting and downcasting, then invoke this method under main method by providing abstract class object as an argument according to user choice*/

import java.util.Scanner;
abstract class D
{
	static Scanner sc=new Scanner(System.in);
	abstract int m1(float a);
	abstract boolean m2(String b);
	static long  m5(byte c)
	{
		System.out.println(c);
		return sc.nextLong();
	}
	D(int a)
	{
		System.out.println(a);
	}
}
class A extends D
{
	int m3(boolean s)
	{
		System.out.println(s);
		return sc.nextInt();
	}
	long m4(byte e)
	{
		System.out.println(e);
		return sc.nextLong();
	}
	int m1(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	boolean m2(String b)
	{
		System.out.println(b);
		return sc.nextBoolean();
	}
	A()
	{
		super(sc.nextInt());
	}

}
class B extends D
{
	int m3(boolean s)
	{
		System.out.println(s);
		return sc.nextInt();
	}
	long m4(byte e)
	{
		System.out.println(e);
		return sc.nextLong();
	}
	int m1(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	boolean m2(String b)
	{
		System.out.println(b);
		return sc.nextBoolean();
	}
	B()
	{
		super(sc.nextInt());
	}
}
class Test
{
	static Scanner sc=new Scanner(System.in);
	void binder(D x,int n)
	{
			if(n==1)
			{
				A x1=new A();
				System.out.println(x1.m3(sc.nextBoolean()));	
				System.out.println(x1.m4(sc.nextByte()));
				System.out.println(x1.m1(sc.nextFloat()));
				System.out.println(x1.m2(sc.next()));
			}
			else
			{
				B x2=new B();
				System.out.println(x2.m3(sc.nextBoolean()));
				System.out.println(x2.m4(sc.nextByte()));
				System.out.println(x.m1(sc.nextFloat()));
				System.out.println(x.m2(sc.next()));
			}
		
	}
	public static void main(String[] args)
	{
		Test t=new Test();
        	System.out.println("1.A\n2.B");
        	int n=sc.nextInt();
		switch(n){
		case 1:
                    	Ab a=new A();
                    	t.binder(a,n);
                    	break;
            	case 2:
                        Ab b=new B();
                    	t.binder(b,n);
                    	break;
            	default: System.out.println("Invalid choice");
		}


	}
}




	