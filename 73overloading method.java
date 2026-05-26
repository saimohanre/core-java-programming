import java.util.Scanner;
class D
{
	static Scanner sc=new Scanner(System.in);
	void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	int  add(float a, int b)
	{
		int e=(int)a+b;
		System.out.println(e);
		return c;
	}
	void add(int a,float b,long c)
	{
		int d=a+((int)(b+c));
		System.out.println(d);
	}
	public static void main(String[] args)
	{
		D obj=new D();
		obj.add(sc.nextInt(),sc.nextInt());
		System.out.println(obj.add(sc.nextFloat(),sc.nextInt()));
		obj.add(sc.nextInt(),sc.nextFloat(),sc.nextLong());
	}
}