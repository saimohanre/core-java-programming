import java.util.Scanner;
class F
{
	static Scanner sc=new Scanner(System.in);
	static int m1()
	{
		try 
		{
			System.out.println("helllo");
		}
		catch(Exception e)
		{	
			System.out.println(e);
		}
		System.out.println("hi");
		return 3;
	}
	public static void main(String[] args)
	{	
		System.out.println(m1());
	}
}