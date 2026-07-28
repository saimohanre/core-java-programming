//120.crjaww need creat a 1 custom defined thread and print the values from 1 to 10 by using custom defined thread.//

import java.util.Scanner;
class D extends Thread
{
	static Scanner sc=new Scanner(System.in);
	public  void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args)
	{
		D obj=new D();
		obj.start();
		for(int i=10;i<=20;i++)
		{	
			System.out.print(i+" ");
		}
	
	}
}