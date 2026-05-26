import java.util.Scanner;
class F
{
	static Scanner sc=new Scanner(System.in);
	static F obj;
	void m1()
	{
		System.out.println("hi");
	}
	public static void main(String[] args)
	{
		try
		{
			obj.m1();
		}
		catch(NullPointerException e)
		{
			System.out.print(e.getMessage());
		}
	}
}