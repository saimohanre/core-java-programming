class A extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" is executing");
	}
	A(ThreadGroup tg,String name)
	{
		super(tg,name);
	}
}
class Test
{
	public static void main(String[] args)
	{
		ThreadGroup tg=new ThreadGroup("My thread");
		A t1=new A(tg,"thread1");
		A t2=new A(tg,"Thread2");
		t1.start();
		t2.start();
		tg.list();
		System.out.println(tg.activeCount());
		System.out.println(tg.getName());
		System.out.println(t1.getName());
	}
}