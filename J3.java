package p4;
import p1.p2.p3.*;
import java.util.Scanner;
public class J3 extends F2 implements I5
{
	public static Scanner sc=new Scanner(System.in);
	public String m4(short e)
	{
		System.out.println(e);
		return sc.next();
	}
	public int m5(String f)
	{
		System.out.println(f);
		return sc.nextInt();
	}
	public J3()
	{
		super(sc.nextLong());
	}
}
