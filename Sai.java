import java.util.Scanner;
class Sai
{
	 Scanner sc=new Scanner(System.in);
	 static float m1(int a)
	{
	         System.out.println(a);
		 Sai v=new Sai();
		 return v.sc.nextFloat();
	}
	Boolean m2(int b, float c)
	{
		System.out.println(b);
		System.out.println(c);
		return sc.nextBoolean();
	}
	public static void main(String[] args)
	{
		Sai obj=new Sai();
		Sai sc=new Sai();
		System.out.println("enter m1 integer value");
		System.out.println(m1(obj.sc.nextInt()));
		System.out.println("enter m2 integer and float values");
		System.out.println(obj.m2(obj.sc.nextInt(),obj.sc.nextFloat()));
	}
}