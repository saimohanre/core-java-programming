class Q35
{
	static java.util.Scanner sc= new java.util.Scanner(System.in);
	static int m1(byte a)
	{
		System.out.println(a);
		return sc.nextInt(); 
	}
	Boolean m2(char b)
	{
		System.out.println(b);
		return sc.nextBoolean();
	}
	static String m3(int c)
	{
		System.out.println(c);
		return sc.next();
	}
	double m4(float d)
	{
		System.out.println(d);
		return sc.nextDouble();
	}
	public static void main(String[] args)
	{
		Q35 obj=new Q35();
		System.out.println(obj.m2(m3((int)obj.m4((float)m1(sc.nextByte()))).charAt(3)));
	}
}