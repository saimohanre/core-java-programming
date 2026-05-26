package p107;
public class Invoke2
{
	public static java.util.Scanner sc=new java.util.Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println(CC1.obj.m1(sc.nextByte()));
		System.out.println(CC1.obj.m2(sc.nextInt()));
		System.out.println(CC2.x.m7(sc.nextFloat()));
		System.out.println(CC2.y.m3(sc.nextLong()));
	 	System.out.println(CC3.z.m5(sc.nextFloat()));
		System.out.println(CC3.w.m6(sc.next()));
	}
}
