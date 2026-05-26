class Q36
{	
	static java.util.Scanner sc=new java.util.Scanner(System.in);
	static int m1(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	String m2(double b)
	{
		System.out.println(b);
		return sc.next();
	}
	static Boolean m3(char d)
	{		
		System.out.println(d);
		return sc.nextBoolean();
	}
	long m4(Boolean e)
	{
		System.out.println(e);
		return sc.nextLong();
	}
	public static void main(String[] args)
	{
	Q36 obj=new Q36();
	System.out.println(m3(obj.m2((double)m1((float)(obj.m4(sc.nextBoolean())))).charAt(2)));
	}
              
}