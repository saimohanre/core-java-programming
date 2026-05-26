import java.util.Scanner;
class Bookmyshow
{
	static Scanner sc=new Scanner(System.in);
	private String username;
	private int password;
	private int age;
	private String gender;
	Bookmyshow(String username,int password,int age,String gender)
	{
		this.username=username;
		this.password=password;
		this.age=age;
		this.gender=gender;
	}
	void setusername(String username)
	{
		this.username=username;
	}
	String getusername()	
	{
		return username;
	}
	void setpassword()
	{
		this.password=password;
	}
	int getpassword()
	{
		return password;
	}
	void setage(int age)
	{
		this.age=age;
	}
	int getage()
	{
		return age;
	}
	void setgender(String gender)
	{
		this.gender=gender;
	}
	String getgender()
	{
		return gender;
	}
}
class User
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		Bookmyshow obj=new Bookmyshow(sc.next(),sc.nextInt(),sc.nextInt(),sc.next());
		User x=new User();
		String oldun=obj.getusername();
		int g=obj.getpassword();
		System.out.println("enter the new username");
		String newun=sc.next();
		if(newun.equals(oldun))
		{
			System.out.println("Login successfully");
		}
		else
		{
			System.out.println("login failed");
		}
	}
}
	




