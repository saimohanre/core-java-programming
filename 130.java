/*crjaww need to create three custom defined threads one thread print from 1 to 10 second thread will print 11 to 20 and last thread will 20 to 30 then the out  put should be in the order with out interruption*/

import java.util.Scanner;
class F extends Thread
{
	static Scanner sc=new Scanner(System.in);
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
class G extends Thread
{
	static Scanner sc=new Scanner(System.in);
	public void run()
	{
		for(int i=11;i<=20;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
class H extends Thread
{
	static Scanner sc=new Scanner(System.in);
	public void run()
	{
		for(int i=21;i<=30;i++)
		{
			System.out.print(i+" ");
		}
	}
}
class J 
{
	public static void main(String[] args) 
	{
		F t1=new F();
		G t2=new G();
		H t3=new H();
	try
	{	
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
	}
	catch(InterruptedException e)
	{
		System.out.println(e);
	}
	}
}

	