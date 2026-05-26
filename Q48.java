import java.util.Scanner;
class S2
{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	float b=sc.nextFloat();
	S2()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println("hi");	
	}
	S2(float c)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	S2(int d,float e)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(d+" "+e);
	}
	S2(String f,boolean g,int h)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(f+" "+g+" "+h);
	}
	public static void main(String[] args)
	{
		new S2();
		new S2(sc.nextFloat());
		new S2(sc.nextInt(),sc.nextFloat());
		new S2(sc.next(),sc.nextBoolean(),sc.nextInt());
	}
}								
