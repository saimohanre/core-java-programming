//*67.cjawwhclass like insta it contain one private filed like password then provide setter getter methods for this variable or filed and we have separate class like user from here update the password and display the updated password to the user by providing dynamic inputs*//

import java.util.Scanner;
class Insta
{
	static Scanner sc=new Scanner(System.in);
	private String password="1234";
	void setPassword(String Password)
	{
		this.password=Password;
	}
	String getPassword()
	{
		return Password;
	}
}
class User
{
	static Scanner sc=Insta.sc;
	public static void main(String[] args)
	{
		Insta x=new Insta();
		System.out.println("enter new password");
		x.setPassword(sc.next());
		System.out.println("updated password"+x.getpassword());
	}
}








		