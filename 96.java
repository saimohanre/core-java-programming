
/*CAJAPWH one class it contains non static method having parameter and return type inside this method we have a local inner class which contains non static method then invoke all the properties under main method by providing dynamic inputs.*/

import java.util.Scanner;
class F
{
	static Scanner sc=new Scanner(System.in);
	int m1(float a)
	{
		System.out.println(a);
		class Inner 
		{
			long m2(byte b)
			{
			System.out.println(b);
			return sc.nextInt();
			}
		}
		Inner x=new Inner();
		System.out.println(x.m2(sc.nextByte()));
		return sc.nextInt();
	}
	public static void main(String[] args)
	{
		F obj=new F();
		System.out.println(obj.m1(sc.nextFloat()));
	}
}
			