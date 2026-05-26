import java.util.Scanner;
class S2
{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	S2()
	{
		System.out.println("hi");	
	}
	S2(float b)
	{
		new S2();
		System.out.println(b);
	}
	S2(int a,float b)
	{
		new S2(sc.nextFloat());
		System.out.println(a+" "+b);
	}
	S2(String a,boolean b,int c)
	{
		new S2(sc.nextInt(),sc.nextFloat());
		System.out.println(a+" "+b+" "+c);
	}
	public static void main(String[] args)
	{
		new S2(sc.next(),sc.nextBoolean(),sc.nextInt());
	}
}								
