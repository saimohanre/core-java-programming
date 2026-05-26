import java.util.*;
class D
{
	static Scanner sc=new Scanner(System.in);
	static void m1() throws InterruptedException
	{
		for(int i=0;i<10;i++)
		{
				Thread.sleep(1000);
				System.out.print(i+" ");
		}
	}
	public static void main(String[] args) throws InterruptedException
	{
			m1();
	}
}