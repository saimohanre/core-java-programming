/*39.CAJAWWH one class like organisation, which provides the deatils like employee id,name,salary,designation,worklocation and company name. create 5 instances by adding 5 emolyee details and display any employee details.by using displaydetails method.According to the user choice byy providing dynamic inputs.*/




import java.util.Scanner;
class Bank
{
	static Scanner sc=new Scanner(System.in);
	String achname;
	int acnum;
	float acbal;
	void cusdetails()
	{
		achname=sc.next();
		acnum=sc.nextInt();
		acbal=sc.nextFloat();
	}
	void display()
	{
		System.out.println(achname);
		System.out.println(acnum);
		System.out.println(acbal);
	}
	public static void main(String[] args)
	{
		Bank cus1=new Bank();
		Bank cus2=new Bank();
		Bank cus3=new Bank();
		Bank cus4=new Bank();
		System.out.println("enter cus1 details");
		cus1.cusdetails();
		System.out.println("enter cus2 details");
		cus2.cusdetails();
		System.out.println("enter cus3 details");
		cus3.cusdetails();
		System.out.println("enter cus4 details");
		cus4.cusdetails();
		System.out.println("enter 1 for cus1\n 2 for cus2\n 3 for cus3\n 4 for cus4");
		int n=sc.nextInt();
		switch(n) 
		{
			case 1:
				cus1.display();
				break;
			case 2:
				cus2.display();
				break;
			case 3:
				cus3.display();
				break;
			case 4:
				cus4.display();
				break;
			default:
				System.out.println("invalid inputs");
		}
	}
}				












