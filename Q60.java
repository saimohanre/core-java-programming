import java.util.Scanner;
class F
{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	void m1(float b)
	{
		System.out.println(b);
	}
}
class G extends F
{
	byte a=sc.nextByte();
	String m2(Boolean c)
	{
		System.out.println(c);
		System.out.println(super.a);
		return sc.next();
	}
	public static void main(String[] args)
	{
		G obj=new G();
		obj.m1(sc.nextFloat());
		System.out.println(obj.m2(sc.nextBoolean()));
	}
}
	