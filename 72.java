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
	Gmail x;
	User (Gmail a)
	{
		x=a;
	}
	void login()
	{
		String word=x.getpassword();	
		System.out.println("enter the new password")
		String word1=sc.next();
		if(word.equals(word1))
		{
			System.out.println("login sucessfull");
		}
		else
		{
			System.out.println("enter 1 for recenter /n 2 for reset");
			int n=sc.nextInt();
			switch(n)
			{
			case 1:
				System.out.println("enter the new pass word");
				String pass1=sc.next();
				if(word.equals(pass1))
				{
					System.out.println("login sucessfull");
					break;
				
				}
				else
				{
					System.out.println("user not found");
					break;
				}
			case 2:
				long mob=x.getmobile();
				System.out.println("enter the new mobile number");
				long mob1=sc.nextLong();
				if(mob==mob1)
				{
					x.setpassword(sc.next());
					System.out.println("updates password:"+x.getpassword());
					break;
				}
				else
				{
					System.out.println("user not found");
					break;
				}
		default:
				System.out.println("enter the wrong option");
			}
		}
	}

				
	public static void main(String[] args)
	{	
		System.out.println("enter the user name,enter the password,entrt the email,enter the mobile"); 
		Gmail obj=new Gmail(sc.next(),sc.next(),sc.next(),sc.nextLong());
		User y=new User(obj);
		y.login();
	}
}















