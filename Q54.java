import java.util.Scanner;
class D
{
	static Scanner sc=new Scanner(System.in);
	static int m1(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	Boolean m2(String b)
	{
		System.out.println(b);
		return sc.nextBoolean();
	}
	String m3(int c)
	{
		System.out.println(c);
		return sc.next();
	}
	D()
	{
		System.out.println(m1(sc.nextFloat()));
	}
	D(float c,boolean d)
	{
		System.out.println(m2(sc.next()));
		System.out.println(c);
		System.out.println(d);
	}
	D(byte g,String f,float e)
	{
		System.out.println(m3(sc.nextInt()));
		System.out.println(g);
		System.out.println(f);
		System.out.println(e);
	}
	public static void main(String[] args)
	{
		D x=new D();
		D x1=new D(sc.nextFloat(),sc.nextBoolean());
		D x2=new D(sc.nextByte(),sc.next(),sc.nextFloat());
	}
}