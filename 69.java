/*crja wwhave one class like insta it contains two private fileds user name and pass word then provide setter and getter methods for these fileds and we have separate class like user here update the user name ans password based on user choice .if he wants to update only user if he wants to update the passwors or else if he wants to update both then update then display the updated values by providing Dynamic inputs.*/

import java.util.Scanner;
class Insta
{
	static Scanner sc=new Scanner(System.in);
	private String password="1234";
	private String username="qwerty";
	void setpassword(String password)
	{
		this.password=password;
	}
	String getpassword()
	{
		return password;
	}
	void setusername(String username)
	{
		this.username=username;
	}
	String getusername()
	{
		return username;
	}
	void setboth(String username,String password)
	{
		this.username=username;
		this.password=password;
	}
}
class User
{
	static Scanner sc=Insta.sc;
	public static void main(String[] args)
	{
		Insta obj=new Insta();
		System.out.println("enter 1 for update name/n 2 for update password/n 3 for both updated and display");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("eneter the new user name");
				obj.setusername(sc.next());
				System.out.println("updated username:"+obj.getusername());
				break;
			case 2:
				System.out.println("enter the new password");
				obj.setpassword(sc.next());
				System.out.println("updated password:"+obj.getpassword());
				break;
			case 3:
				System.out.println("enter the new username,enter the new password");
				obj.setboth(sc.next(),sc.next());
				System.out.println("updated username:"+obj.getusername());
				System.out.println("updated password:"+obj.getpassword());
				break;
			default:
				System.out.println("enter the wrong choice");
		}
	}	
}
				








