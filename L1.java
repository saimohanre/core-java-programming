package test;
import p1.*;
import java.util.Scanner;
public class L1 extends Dis implements I3
{
	public static Scanner sc=new Scanner(System.in);
	public L1()
	{
		super(sc.nextInt());
	}
	public long m1(String a)
	{
		System.out.println(a);
		return sc.nextLong();
	}
	public String m2(long c)
	{
		System.out.println(c);
		return sc.next();
	}

}

				