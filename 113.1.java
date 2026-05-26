import java.util.Scanner;
class D
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
	int a[]={1,2,3};
	try
	{
		System.out.println(a.length());
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
	try
	{
		int e=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(e/b);		
	}
	catch(ArithmeticException e)
	{
		System.out.println(e.getMessage());
	}
	try
	{
		String s=sc.next();
		int f=Integer.parseInt(s);
		System.out.println(f);	
	}
	catch(NumberFormatException e)
	{
		e.printStackTrace();
	}
	}
}