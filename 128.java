/*creat a java application ww need to craet to custom defined threads then 1 st thread have to print 1 to 10 numbers and other thread have to print the values from 2o to 30.*/

import java.util.Scanner;
class D extends Thread
{
	static Scanner sc=new Scanner(System.in);
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
	}
}
class G extends Thread
{
	public void run()
	{
		int s=30;
		for(int i=20;i<=s;i++)
		{
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args)
	{
		D t1=new D();
		G t2=new G();
		t2.start();
		t1.start();
	}
}