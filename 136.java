import java.util.Scanner;
class Bus
{
	static synchronized void m1()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
	}
}
class User 
{
	static Runnable r =new Runnable()
	{
		public void run()
		{
			new Bus().m1();
		}	
	
	};
	public static void main(String[] args) throws Exception
	{
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		Thread t3=new Thread(r);
		t1.start();
		t2.start();
		t3.start();	
	}
}