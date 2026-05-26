import java.util.Scanner;
abstract class D
{
	static Scanner sc =new Scanner(System.in);
	abstract int m1(float a);
	abstract long m2(String b);

	static String m3(Boolean c)
	{
		System.out.println(c);
		return sc.next();
	}
}
class F extends D
{
	static Scanner  sc=D.sc;
	int m1(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	long m2(String b)
	{
		System.out.println(b);
		return sc.nextLong();
	}
	public static void main(String[] args)
	{
		F obj=new F();
		System.out.println(obj.m1(sc.nextFloat()));
		System.out.println(obj.m2(sc.next()));
		System.out.println(m3(sc.nextBoolean()));
	}
}
