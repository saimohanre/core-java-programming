import java.util.Scanner;
class T
{
	static Scanner sc=new Scanner(System.in);
	int a;
	T()
	{
		a=sc.nextInt();
		System.out.println("hi");
	}
	public static void main(String[] args)
	{
		T obj=new T();
		System.out.println(obj.a);
	}
}
