import java.util.Scanner;
class Student
{
	static Scanner sc=new Scanner(System.in);
	float attandance=sc.nextFloat();
	String corejava(float attendance)
	{
		if(attandance>this.attandance)
		{
			return(" good keep it up" );
		}
		else
		{
			return("bad");
		}
		
	}
	public static void main(String[] args)
	{
		Student obj=new Student();
		System.out.println(obj.corejava(sc.nextFloat()));
	}
}
	