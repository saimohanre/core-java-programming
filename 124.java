import java.util.Scanner;
class F
{
	static Scanner sc=new Scanner(System.in);
	static int m1(int a,int b)
	{
		try 
		{
			System.out.println(a/b);
			System.out.println("helllo");
			return 1;
		}
		catch(Exception e)
		{	
			System.out.println(e);
			return 2;
		}
		finally
		{
			System.out.println("hi");
			return 3;
		}
	}
	public static void main(String[] args)
	{	
		System.out.println(m1(sc.nextInt(),sc.nextInt()));
	}
}