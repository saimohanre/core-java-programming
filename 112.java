import java.util.Scanner;
class F
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		int sum=0;
		for(int i=0;i<args.length;i++)
		{
			try
			{
				sum+=Integer.parseInt(args[i]);
			}
			catch(NumberFormatException e)
			{
				System.out.println(e);
			}
		}
	}
	
}
		