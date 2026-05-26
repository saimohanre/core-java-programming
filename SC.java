import java.util.Scanner;
class SC
{
	static long m1(int a)
	{
		System.out.println(a);
		return 12345;
	}
	public static void main(String[] args)
	{
	 	Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer value");
		int n=sc.nextInt();
		System.out.println(m1(n));
	}
}