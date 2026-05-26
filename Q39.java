import java.util.Scanner;
class Organization
{
	static Scanner sc=new Scanner(System.in);
	int empid;
	String empname;
	float empsal;
	String empdes;
	String empwloc;
	void setdetails()
	{
	empid=sc.nextInt();
	empname=sc.next();
	empsal=sc.nextFloat();
	empdes=sc.next();
	empwloc=sc.next();
	}
	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empsal);
		System.out.println(empdes);
		System.out.println(empwloc);
	}
	public static void main(String[] args)
	{
		Organization emp1=new Organization();
		Organization emp2=new Organization();
		Organization emp3=new Organization();
		Organization emp4=new Organization();
		Organization emp5=new Organization();
		System.out.println("eneter emp1 details");
		emp1.setdetails();
		System.out.println("enter emp2 details");
		emp2.setdetails();
		System.out.println("enter emp3 details");
		emp3.setdetails();
		System.out.println("enter emp4 details");
		emp4.setdetails();
		System.out.println("enter emp5 deatils");
		emp5.setdetails();
		System.out.println("enter 1 for emp1\n 2 for emp2\n  3 for emp3\n  4 for emp4\n  5 for emp5");
		int n=sc.nextInt();
		switch(n) 
		{
			case 1:
				emp1.display();
				break;
			case 2:
				emp2.display();
				break;
			case 3:
				emp3.display();
				break;
			case 4:
				emp4.display();
				break;
			case 5:
				emp5.display();
				break;	
			default:
		  		System.out.println("hi");
		}
	}
}
				
	
	