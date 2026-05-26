/*39.CAJAWWH one class like organisation, which provides the deatils like employee id,name,salary,designation,worklocation and company name. create 5 instances by adding 5 emolyee details and display any employee details.by using display details method.According to the user choice byy providing dynamic inputs.*/


import java.util.Scanner;
class Organisation
{
	static Scanner sc=new Scanner(System.in);
	int eid;
	String ename;
	String edes;
	float esalary;
	void details()
	{
		eid=sc.nextInt();
		ename=sc.next();
		edes=sc.next();
		esalary=sc.nextFloat();
	}
	void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(edes);
		System.out.println(esalary);
	}
	public static void main(String[] args)
	{
		Organisation emp1=new Organisation();
		Organisation emp2=new Organisation();
		Organisation emp3=new Organisation();
		Organisation emp4=new Organisation();
		Organisation emp5=new Organisation();
		System.out.println("enter the emp1 details");
		emp1.details();
		System.out.println("enter the emp2 details");
		emp2.details();
		System.out.println("enter the emp3 details");
		emp3.details();
		System.out.println("enter the emp4 details");
		emp4.details();
		System.out.println("enter the emp5 details");
		System.out.println("enter 1 for emp1\n 2 for emp2\n 3 for emp3\n 4 for emp4\n 5 for emp5");
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
				System.out.println("enter the wrong value");
		}
	}
}














		
		