class T3
{
	static java.util.Scanner sc=new  java.util.Scanner(System.in);
	static int a=sc.nextInt();
	String b=sc.next();
	Boolean m1(long c)
	{
		System.out.println(c);
		return sc.nextBoolean();
	}
	T3()
	{
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args)
	{
		T3 obj=new T3();
		System.out.println(a);
		System.out.println(obj.b);
		System.out.println(obj.m1(sc.nextLong()));
	}
}



		
	
	
	
	