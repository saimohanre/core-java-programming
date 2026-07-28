/*cjwwhave one abstract class  which contain two abstract methods having parameter and return type then provide implements for abstract methods by using anounymus inner class by proving dynamic inputs*/
	
import java.util.Scanner;
abstract class F
{
	static Scanner sc=new Scanner(System.in);
	abstract int m1(float a);
	abstract byte m2(String b);
	public static void main(String[] args)
	{
	F x=new F()
	{
		int m1(float a);
		{
			System.out.println(a);
			return sc.nextInt();
		}
		byte m2(String b)	
		{
			System.out.println(b);
			return sc.nextByte();
		}
	};
	System.out.println(x.m1(sc.nextFloat()));
	System.out.println(x.m2(sc.next()));

	}
}
	
