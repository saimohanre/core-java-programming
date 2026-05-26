import java.util.Scanner;
class B
{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt(); 
	B()
	{
		this(sc.nextFloat(),sc.nextBoolean());
       		System.out.println(a);
	}
	B(int b)
	{
		System.out.print(b);
	}
	B(float c,boolean d)
	{
		this(sc.nextInt());
		System.out.println(c+" "+d);
	}
	public static void main(String[] args)
	{
		
		new B();
		
	}
}