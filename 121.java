import java.util.Scanner;
class D
{
static Scanner sc=new Scanner(System.in);
public static void main(String args[])
{
	int[] array={10,20,30};
	int c=0;
	try
	{
	for(int i=0;true;i++)
	{
		System.out.print(array[i]);
		c++;
	}
	}
	catch(ArrayIndexOutOfBoundsException e)	
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println(c);	
	}
}
}