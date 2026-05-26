import java.util.Scanner;
class D
{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	D()
	{
		System.out.println(a);
	}
	D(D obj)
	{
		System.out.println(a);
		System.out.println(obj.a);
	}	
	
	public static void main(String[] args)
	{
		D obj=new D();
		D obj2=new D(obj);
	}
}