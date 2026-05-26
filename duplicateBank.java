/*create a java application where we have one class BANK which contains instance variable balance and two non static methods like withdraw and deposit and another non static method balanceEnquiry which displays the current balance then inherit this class into another class USER where we have non static method banking here dispplay the available options for the user and then based on user choice do respective transaction then after completion of one transaction ask user if he want to do another transaction or exit the application based on user requirement, do the respective process then invoke this method under main method by providing dynamic inputs.*/

import java.util.Scanner;
class Bank
{
	static Scanner sc=new Scanner(System.in);
	float ba=sc.nextInt();
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
	void balanceenq(float ba)
	{
		System.out.println(ba);
	}
}
class User extends Bank
{
	void banking()
	{
		System.out.println("enter 1.withdrew/n 2 for deposit/n 3 for balanceenq");
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
				balanceenq(sc.nextFloat());
				break;
			default:
				System.out.println("enter wrong value");
		}
		System.out.println("enter 1 for continue/n 2 for thank you");
		int c=sc.nextInt();
		if(c==1)
		{
			banking();
		}
		else
		{
			System.out.println("thank you");
		}
	}
		public static void main(String[] args)
		{
			User obj=new User();
			obj.banking();
		}
}	










