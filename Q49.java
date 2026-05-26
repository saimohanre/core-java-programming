import java.util.Scanner;
class B
{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	long m1(String a)
	{
		System.out.println(a);
		System.out.println(this.a);
		return sc.nextLong();
	}
	
	public static void main(String[] args)
	{
		B obj=new B();
		System.out.println(obj.m1(sc.next()));
	}
}
	
