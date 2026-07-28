/* Create a java application where we need to create 2 custom defined threads one thread prints the numbers from 1 to 10 and other thread print the numbers from 11 to 20 then keep the second thread in waiting state until first thread prints upto 5 and then move it from waiting state to running state*/

import java.util.Scanner;
class F	extends Thread
{
	static Scanner sc=new Scanner(System.in);
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				H.t2.resume();
			}
			System.out.print(i+" ");
		}
	}
}
class G extends Thread
{
	public void run()
	{
		for(int i=11;i<=20;i++)
		{
			System.out.println(i+" ");
		}
	}
}
class H 
{
	public static void main(String[] args)
	{
		F t1=new F();
		 G t2=new G();
		t2.setName("hi");
		t2.start();
		t2.suspend();
		t1.start();
	}
}
		