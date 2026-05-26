import java.util.Scanner;
class G
{
	static Scanner sc=new Scanner(System.in);
	float m1(int a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
	String m2(double b)
	{
		System.out.println(b);
		return sc.next();
	}
	public static void main(float a)
	{
		System.out.println(a);
	}
	public static void main(String[] args)	{
		G obj=new G();
		System.out.println(obj.m1(sc.nextInt()));
		System.out.println(obj.m2(sc.nextDouble()));
		main(sc.nextFloat());
	}
}
class F extends G
{
	static Scanner sc=new Scanner(System.in);
	int m3(float b)
	{
		System.out.println(b);
		return sc.nextInt();
	}
	public static void main(String[] args)
	{
		F v=new F();
		System.out.println(v.m3(sc.nextFloat()));
	}
}
