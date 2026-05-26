package p4;
import p1.p2.G1;
import java.util.Scanner;
public class Test1
{
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		J2 obj=new J2();
		System.out.println(obj.m1(sc.nextInt()));
		System.out.println(obj.m2(sc.nextBoolean()));
		G1 x=new G1();
		System.out.println(x.m3(sc.nextLong()));
		J3 y=new J3();
		System.out.println(y.m4(sc.nextShort()));
		System.out.println(y.m5(sc.next()));
	}
}
	