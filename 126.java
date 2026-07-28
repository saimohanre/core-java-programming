/*craww need to creat three custom defined threads and then checks whether the threads are in live state or not and display the priority values of the threads and then set prority values ans user defined names for the threads ans then  start and display their priority  values and then check whether they are in live state or not.*/


import java.util.Scanner;
class F extends Thread
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		F t1=new F();
		F t2=new F();
		F t3=new F();
		System.out.println(t1.getName()+" "+t1.isAlive());
		System.out.println(t2.getName()+" "+t2.isAlive());
		System.out.println(t3.getName()+" "+t3.isAlive());
	
		System.out.println(t1.getName()+" "+t1.getPriority());
		System.out.println(t2.getName()+" "+t2.getPriority());
		System.out.println(t3.getName()+" "+t3.getPriority());


		t1.setName("hi");
		t2.setName("hello");
		t3.setName("world");
	
		t1.setPriority(2);
		t2.setPriority(8);
		t3.setPriority(7);
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println(t1.getName()+" "+t1.isAlive());
		System.out.println(t2.getName()+" "+t2.isAlive());
		System.out.println(t3.getName()+" "+t3.isAlive());
		
		System.out.println(t1.getName()+" "+t1.getPriority());
		System.out.println(t2.getName()+" "+t2.getPriority());
		System.out.println(t3.getName()+" "+t3.getPriority());
	}
}		




