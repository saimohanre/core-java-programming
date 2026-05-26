package test;
import p1.*;
import p1.p2.H1;
import java.util.Scanner;
public class Invoke1
{
	public static Scanner sc=new Scanner(System.in);	
	public static void main(String[] args)
	{
		L1 x=new L1();		
		System.out.println(x.m1(sc.next()));
		H1 y=new H1();
		System.out.println(y.m4(sc.nextShort()));
		System.out.println(y.m5(sc.next()));
		
		System.out.println(x.m2(sc.nextLong()));
		System.out.println(x.m3(sc.nextInt()));
	}
}
