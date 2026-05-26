import java.util.Scanner;
class Q32
{
	static Scanner sc=new Scanner(System.in);
	int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	int sub(int c,int d)
	{
		int e=c-d;
		return e;
	}
	int mul()
	{
		int f=add(sc.nextInt(),sc.nextInt());
		int g=sub(sc.nextInt(),sc.nextInt());
		return f*g;
	}
	public static void main(String[] args)
	{
		Q32 obj=new Q32();
		System.out.println(obj.mul());
	}
}

		
	