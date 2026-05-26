import java.util.Scanner;
class D
{
	static Scanner sc=new Scanner(System.in);
	int m2(boolean a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	String m3(float b)
	{
		System.out.println(b);
		return sc.next();
	}
	byte m4(char h)
	{
		System.out.println(h);
		return sc.nextByte();
	}
	D()
	{
		System.out.println("hi");
	}
	D(float c , D x)
	{
		System.out.println(c);
		System.out.println("double parameterized");
	}
	D(String d,D x)
	{
		System.out.println(d);
		System.out.println("triple parameterized");
	}
	public static void main(String[] args)
	{
		new D(sc.next(),new D(sc.nextFloat(),new D())).m4(new D().m3(new D().m2(sc.nextBoolean())).charAt(0));
		//D obj = new D();	
		//new D(sc.next(),new D(sc.nextFloat(),new D().m4(obj.m3(obj.m2(sc.nextBoolean()))).sc.next().charAt(0)))));
	}
}