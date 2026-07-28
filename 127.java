/*Create a java application where we need to create one custom defined thread then print the values of with 1 to 10 with the time interval 10 sec*/

import java.util.Scanner;
class F extends Thread
{
	static Scanner sc=new Scanner(System.in);
	public void run()
	{
		int n=10;
		for(int i=1;i<=n;i++)
		{
			try
			{
			Thread.sleep(1000);
			System.out.print(i+" ");
			}
			catch(InterruptedException e)	
			{
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args)
	{
		F t1=new F();
		t1.start();
	}
}		
