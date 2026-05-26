import java.util.Scanner;
class F
{
	static Scanner sc=new Scanner(System.in);
	static long d=sc.nextInt();
	String m1(int b)
	{
		System.out.println(b);
		return sc.next();
	}
}
class G extends F
{
	float a=sc.nextFloat();
	String m1(int b)
	{
		System.out.println(b);
				System.out.println(super.m1(sc.nextInt()));
		return sc.next();
	}
	public static void main(String[] args)
	{
		G obj=new G();
		System.out.println(obj.a);
		System.out.println(d);
		System.out.println(obj.m1(sc.nextInt()));
	}
}
	