class Q34
{
	static java.util.Scanner sc=new java.uitl.Scanner(System.in);
	Boolean m1(int a)
	{
		System.out.println(a);
		return sc.nextBoolean();
	}
	static String m2(boolen b)
	{
		System.out.printl(b);
		return sc.next();
	}
	double m3(char d)
	{
		System.out.pintln(d);
		return sc.nextDouble();
	}
	public static void main (Sring[] args)
	{
		Q34 obj=new Q34();
		//boolean c=obj.m1(sc.nextInt());
		//String e=m2(c);
		//double f=obj.m3(d.charAt()));
		System.out.println(obj.m3(m2(obj.m1(sc.nextInt())).charAt(0)));
          }
}
