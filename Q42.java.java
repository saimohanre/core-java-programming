import java.util.Scanner;
class S
{
	static Scanner sc=new Scanner(System.in);
	String a=sc.next();
	S(Boolean a)            	//in case variables have same to give first give value to the constructure data type and variable
	{
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		S obj=new S(sc.nextBoolean());
		System.out.println(obj.a);
	}
}
		
		
