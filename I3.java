package p1;
import java.util.Scanner;
public interface I3
{
	public static Scanner sc=new Scanner(System.in);
	String m2(long c);
	default long m3(int d)
	{
		System.out.println(d);
		return sc.nextLong();
	}
}