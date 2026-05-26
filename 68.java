/* 68.cjawwe have one class like bank which contains two private fields like user name and atm pin then provide setter getter mathods for this fields.and we have a another class like user from here update user name and atm pin and then display the old  values and updated values.by providing dynamic inputs.*/

import java.util.Scanner;
class Bank
{
	static Scanner sc=new Scanner(System.in);
	private String username="sai";
	private int pin=1234;
	 void setusername(String username)
	{
		this.username=username;
	}
	 String getusername()
	{
		return username;
	}
	 void setpin(int pin)
	{
		this.pin=pin;
	}
	 int getpin()
	{
		return pin;
	} 
}
class User
{
	static Scanner sc=Bank.sc;
	public static void main(String[] args)
	{
		Bank obj=new Bank();
		String  oldusername=obj.getusername();
		System.out.println("enter the new user name");
		b.setusername(sc.next());
                String newusr=b.getusername();
		int oldpin=obj.getpin();
		System.out.println("enete the new password");
		obj.setpin(sc.nextInt());
		int newpin(obj.getpin());

		System.out.println("oldusername:"+oldusername);
		System.out.println("oldpin:"+oldpin);
		System.out.println("updatedusername:"+newusr);
		System.out.println("updatespin:"+newpin);
		
	}
}
		