import java.util.Scanner;
class D
{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	D()
	{
		System.out.println("default");
	}
	D(D x,float c)
	{
		System.out.println(c);
		System.out.println("double parameterized");
	}
	D(D x,String d,float e)
	{
		System.out.println(d+" "+e);
		System.out.println("triple parameterized");
	}
	public static void main(String[] args)
	{
			new D(new D(new D(),sc.nextFloat()),sc.next(),sc.nextFloat());
	}
}