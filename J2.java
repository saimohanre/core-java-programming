package p4;
import p1.*;
import java.util.Scanner;
public class J2 extends F1 implements I4
{
	public static Scanner sc=new Scanner(System.in);
	public long m1(int a)
	{
		System.out.println(a);
		return sc.nextLong();
	}
	public String m2(boolean b)
	{
		System.out.println(b);
		return sc.next();
	}
}