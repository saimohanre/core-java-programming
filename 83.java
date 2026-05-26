/*83.cjawwh one abstract class which contains one abstract method one defined method and one pc then inherit this class iinto one more abstract class which vontaind one abstract method and one pc then inherit this class into conctret class ,provide implementation for all abstract methods and invoke all the methods under display method of conceret class ehich does not ave any p and return type invoke dispalay under main method.*/

import java.util.Scanner;
abstract class F
{
	static Scanner sc=new Scanner(System.in);
	abstract int m1(String a);
	
	Boolean m2(byte b)
	{
		System.out.println(b);
		return sc.nextBoolean();
	}
	
	F(float c)
	{
		System.out.println(c);
	}
}
abstract class D extends F
{
	abstract long m3(String c);

	D(int a)
	{
		System.out.println(a);
		super(sc.nextFloat());
	}
}
class G	extends D
{
	int m1(String a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	long m3(String c)
	{
		System.out.println(c);
		return sc.nextLong();
	}
	void display()
	{
		System.out.println(m1(sc.next()));
		System.out.println(m2(sc.nextByte()));
		System.out.println(m3(sc.next()));
		
	}
	G()
	{
		super(sc.nextInt());
	}
	public static void main(String[] args)
	{
		G x=new G();
		x.display();
	}
}
		
