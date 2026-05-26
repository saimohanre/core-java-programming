import java.util.Scanner;
class T4
{
	static Scanner sc=new Scanner(System.in);
	static int a=sc.nextInt();
	float b=sc.nextFloat();
	static int m1(Boolean c)
	{
		System.out.println(c);
		return sc.nextInt();
	}
	float m2(String d)
	{
		System.out.println(d);
		return sc.nextFloat();
	}
	T4()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(m1(sc.nextBoolean()));
		System.out.println(m2(sc.next()));
	}
	public static void main(String[] args)
	{
		new T4();
	}
}
		
	
	
