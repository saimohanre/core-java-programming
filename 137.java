import java.util.Scanner;
class Account
{
	static Scanner sc=new Scanner(System.in);
	double bal=10000;
	synchronized double withdraw(double wamt)
	{
		if(wamt>bal)
		{
			System.out.println("invalid amount wait some time for deposit money");
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		bal=bal-wamt;
		System.out.println("Available balance after deposit:"+bal);
		return bal;
	}
	synchronized void deposit(double dep)
	{
		bal+=dep;
		System.out.println("Available balance after deposit"+bal);
		notify();
	}
}
class G	extends Thread
{
	static Account x;
	G(Account x)
	{
		this.x=x;
	}
	public void run()
	{
		System.out.println(x.withdraw(12000));
	}
}
class H extends Thread
{
	static Account x;
	H(Account x)
	{
		this.x=x;
	}
	public void run()
	{
		x.deposit(10000);
	}	
}
class I
{
	public static void main(String[] args)
	{
		Account x=new Account();
		G t1=new G(x);
		H t2=new H(x);
		t1.start();
		t2.start();	
	}	
}














