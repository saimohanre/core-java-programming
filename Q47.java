47.Create a Java application where we have one class which contains two instance variable with out initialization , then initialize variables while creating object print is variable under object parametarized constructer also print the copied values of these variables ,invoke these properties under main method by providing dynamic inputs.

import java.util.Scanner;
class D
{
	static Scanner sc=new Scanner(System.in);
	int a;
        float b;
	D(int c,float d)
	{
		a=c;
		b=d;
	}
	D(D x)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(obj.a);
		System.out.println(obj.b);
	}
	public static void main(String[] args)
	{
		D x=new D(sc.nextInt(),sc.nextFloat());
		D x1=new D(x);
	}
}
	