/*Create a java application where we have one class which contains a method m1 which prints thevalues from 1 to 10 then access this resource with two different threads and it will allow only one by one thread*/

class F
{
	
	synchronized void m1()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}
class G extends Thread
{
	static F x=new F();
	public void run()
	{
		x.m1();
	}
	public static void main(String[] args)
	{
		G t1=new G();
		G t2=new G();
		t1.start();
		t2.start();
	}
}	
