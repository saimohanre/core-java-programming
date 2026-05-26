/*71.cjawwe have one class like gmail whisvh contain private field like email and mobile username,password initialize these private fileds using constructor injection and setter getter method we also have another class like user here update the user name only it is matched to the user mobile number else display as user not found.update password only if it matches  with to the email or else display user not found.*/


import java.util.Scanner;
class Gmail
{
	private String username;
	private	String password;
	private String email;
	private long mobile;
	static Scanner sc=new Scanner(System.in);
	Gmail(String username,String password,String email,long mobile)
	{
		this.username=username;
		this.password=password;
		this.email=email;
		this.mobile=mobile;
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
	void setemail(String email)
	{
		this.email=email;
	}	
	void setmobile(long mobile)
	{
		this.mobile=mobile;
	}
	String getemail()
	{
		return email;
	}
	long getmobile()
	{	
		return mobile;
	}
}
class User
{
	static Scanner sc=Gmail.sc;
	public static void main(String[] args)
	{	
		System.out.println("enter the username,enter the password,enter the email,eneter the mobile no");
		Gmail obj=new Gmail(sc.next(),sc.next(),sc.next(),sc.nextLong());
		System.out.println("enetr 1 for username\n 2 for password");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
				long mob=obj.getmobile();
				System.out.println("enter the new mobile number");
				long newmob=sc.nextLong();
				if(mob==newmob)
				{
					System.out.println("enter the username");
					obj.setusername(sc.next());
					System.out.println("new username:"+obj.getusername());
				}
				else
				{
					System.out.println("user not found");
				}
				break;
			case 2:
				String email=obj.getemail();
				System.out.println("enter the new eamil");
				String email1=sc.next();
				if(email.equals(email1))
				{
					System.out.println("enter the password");
					obj.setpassword(sc.next());
					System.out.println("new password:"+obj.getpassword());
				}
				else
				{
					System.out.println("user not found");
				}
				break;
			default:
				System.out.println("eneter wromg option");
			}
	}
}

















