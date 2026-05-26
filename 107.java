import java.util.Scanner;
class D
{
	static Scanner sc=new Scanner(System.in);
	static void m1(int a,int b)
	{
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException g)
		{
			System.out.println(g);
		}
	}
	public static void main(String[] args)
	{
		m1(sc.nextInt(),sc.nextInt());
	}
}
	