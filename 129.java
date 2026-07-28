/*creat java application where we need to creat to custom defined threads working on the same resource  which iterates the numbers from 1 to 20 the print all the three multiples by using first thread and all four multiple by using second thread.*/

import java.util.Scanner;
class F extends Thread
{
	static Scanner sc=new Scanner(System.in);
	public void run()
	{
	for(int i=1;i<=20;i++)
	{
		if(Thread.currentThread().getName().equals("hi"))
		{
			if(i%3==0)
			{
				System.out.print(i+"t ");
			}
		}
		else if(Thread.currentThread().getName().equals("hello"))
		{
			if(i%4==0)
			{
				System.out.print(i+"t1 ");
			}
		}
	}
	}
	public static void main(String[] args)
	{
		F t1=new F();
		F t2=new F();
		t1.setName("hi");
		t2.setName("hello");
		t1.start();
		t2.start();
	}
}