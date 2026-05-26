/*cjawwh one interface which contains one abstract method one defined method then inherit this interface into one concret class provide implementation for abstract mehod and invoke all the properties under main method by providing dynamic inputs.*/

import java.util.Scanner;
interface I1
{
	static Scanner sc=new Scanner(System.in);
	int m1(float a);
	default String m2(boolean b)
	{
		System.out.println(b);
		return sc.next();
	}
}
class D implements I1
{
	public int m1(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	public static void main(String[] args)
	{
		D obj=new D();
		obj.m1(sc.nextFloat());
		obj.m2(sc.nextBoolean());
	}
}