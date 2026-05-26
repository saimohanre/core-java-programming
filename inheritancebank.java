/*create a java application where we have one class BANK which contains instance variable balance and two non static methods like withdraw and deposit and another non static method balanceEnquiry which displays the current balance then inherit this class into another class USER where we have non static method banking here dispplay the available options for the user and then based on user choice do respective transaction then after completion of one transaction ask user if he want to do another transaction or exit the application based on user requirement, do the respective process then invoke this method under main method by providing dynamic inputs.*/

import java.util.Scanner;
class Bank
{
	static Scanner sc= new Scanner(System.in);
	float ba=sc.nextFloat();
	float withdraw(float a)
	{
		ba=ba-a;
		return ba;
	}
	float deposit(float b)
	{
		ba=ba+b;
		return ba;
	}
	void  balanceenquery()
	{
		System.out.println("balance:"+ba);
	}
}
class User extends Bank 
{
	void banking()
	{
		System.out.println("1.withdraw/n 2.deposit/n 3.balanceenquiry");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
				System.out.println(withdraw(sc.nextFloat()));
				break;
			case 2:
				System.out.println(deposit(sc.nextFloat()));
				break;
			case 3:
				balanceenquery();
				break;
			default:
				System.out.println("wrong option");
		
		}
		System.out.println("do want to continue give 1(or) any thing");
		char c=sc.next().charAt(0);
		if(c=='1')
			banking();
		else 
			System.out.println("thank you");
	}
	public static void main(String[] args)
	{
		User obj=new User();
		obj.banking();
         }
		
}
