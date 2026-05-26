package p104;
public interface May
{
	public static java.util.Scanner sc=new java.util.Scanner(System.in);
	long m1(byte a);
	default String m2(int b)
	{
		System.out.println(b);
		return sc.next();
	}
}	