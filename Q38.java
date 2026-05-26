import java.util.Scanner;
class Organization
{
	static Scanner sc=new Scanner(System.in);
	int eid=sc.nextInt();
	String ename=sc.next();
	float esal=sc.nextFloat();
	String eds=sc.next();
	String ewl=sc.next();
	void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(esal);
		System.out.println(eds);
		System.out.println(ewl);
	}
	public static void main(String[] args)
	{
	Organization e1=new Organization();
	Organization e2=new Organization();
	Organization e3=new Organization();
	Organization e4=new Organization();
	Organization e5=new Organization();
	System.out.println("1.emp1/n 2.emp2/n 3.emp1/n 4.emp4/n 5.emp5");
	int n=sc.nextInt();
	switch(n)
	{
		case 1:
			e1.display();break;
		case 2:
			e2.display();break;
		case 3:
			e3.display();break;
		case 4:
			e4.display();break;
		case 5:
			e5.display();
			break;
		default:
			System.out.println("invalid inputs");
	}
	}
}
			
		

	
	