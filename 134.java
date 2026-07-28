class S
{
	void m1()
	{
		synchronized(this)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(int i=11;i<=20;i++)
		{
			System.out.print(i+" ");
		}

	}
}
class F extends Thread
{
	public void run()
	{
		S x=new S();
		x.m1();
	}
	public static void main(String[] args)
	{
		F t1=new F();
		F t2=new F();
		t1.start();
		t2.start();
	}
}