/* creja we need to creat two custom defined threads  first thread has to print the letters from A to Z,and second thread has to letters from  a to z 
note:-print the letters A to G after that print the letters from a to g after that print the capital letters after that print remaining small letters.*/

import java.util.Scanner;
class F extends Thread
{
	static Scanner sc=new Scanner(System.in);
	public void run()
	{
		for(char ch='A';ch<='Z';ch++)
		{
			if(ch=='G')
			{
				H.t2.resume();
				H.t1.suspend();
			}
			System.out.print(ch+" ");
		}
		H.t2.resume();
	}
}
class G extends Thread
{
	static Scanner sc=new Scanner(System.in);
	public void run()
	{-0uyt
		for(char ch='a';ch<='z';ch++)
		{
			if(ch=='g')
			{
				H.t1.resume();
				H.t2.suspend();
			}
			System.out.print(ch+" ");
		}
	}
}
class H
{
	static F t1;
	static G t2;
	public static void main(String[] args)
	{
		t1=new F();
		t2=new G();
		t1.start();
		t2.start();
		t2.suspend();
	}
}
		