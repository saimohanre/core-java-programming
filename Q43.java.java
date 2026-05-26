import java.util.Scanner;
class S1
{
	static Scanner sc=new Scanner(System.in);
	int a;
	String b;
	float c;
	S1(int d, String e, float f)
	{
		a=d;
		b=e;
		c=f;
	}
	public static void main(String[] args)
	{
		S1 obj=new S1(sc.nextInt(),sc.next(),sc.nextFloat());
		System.out.println(obj.a);
		System.out.println(obj.b);	
		System.out.println(obj.c);
	}
}