/*70.cjawwhave one class like bank it contains private fields like user name and password initialize thse fileds by using constructor injection and provide setter getter methods for these fields and we have another class like user update private fields and display the updated values to the user by unsing dynamic inputs*/

import java.util.Scanner;
class Bank
{
	private String username;
	private	String password;
	static Scanner sc=new Scanner(System.in);
	Bank(String username,String password)
	{
		this.username=username;
		this.password=password;
	}
	void setusername(String username)
	{
		this.username=username;
	}
	void setpassword(String password)
	{
		this.password=password;
	}
	String getpassword()
	{
		return password;
	}
	String getusername()
	{
		return username;
	}
}
class User
{
	static Scanner sc=Bank.sc;
	public static void main(String[] args)
	{
		System.out.println("eneter the username,enetr the password");
		Bank b=new Bank(sc.next(),sc.next());
		System.out.println("enter the newusername");
		b.setusername(sc.next());
		System.out.println("updated username:"+b.getusername());
		System.out.println("enter the newpassword");
		b.setpassword(sc.next());
		System.out.println("updated password:"+b.getpassword());
	}
}











