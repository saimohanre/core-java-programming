class I
{
	static int m1(int a)
        {
		System.out.println(a);		
		return 20;
	}
	static void m2(boolean c)
	{
		System.out.println(c);
	}
	static char m3()
	{
		System.out.println("hi");
		return 'A';
	}
	static void m4()
	{
		System.out.println("hello");
	}
	public static void main(String[] args)
	{
		System.out.printzln(m1(409));
		m2(true);
		System.out.println(m3());
		m4();
	}
}
