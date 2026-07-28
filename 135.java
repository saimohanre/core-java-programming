import java.util.Scanner;
class Bus
{
	static boolean b=true;
	static synchronized void seat()
	{
		if(b)
		{
			System.out.println(Thread.currentThread().getName()+"->Seat is Booked Sucessfully");
			b=false;			
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+"->Seat is already booked");	
		}
	}
}
class User 
{
	Runnable r =new Runnable()
	{
		public void run()
		{
			new Bus().seat();
		}	
	
	};
	public static void main(String[] args) throws Exception
	{
		Thread t1=new Thread();
		Thread t2=new Thread();
		Thread t3=new Thread();
		t1.setName("hi");
		t2.setName("hello");
		t3.setName("Man");
		t1.start();
		t2.start();
		t3.start();	
	}
}