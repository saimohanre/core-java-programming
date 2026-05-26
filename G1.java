package p1.p2;
import java.util.Scanner;
public class G1
{
	public static Scanner sc=new Scanner(System.in);
	public static int m3(long c)
	{
		System.out.println(c);
		return sc.nextInt();
	}
	public G1(byte d)
	{
		System.out.println(d);
	}
	public G1()
	{
		this(sc.nextByte());
	}
} 