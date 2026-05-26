import java.util.Scanner;
abstract class Pay
{
	static Scanner sc=new Scanner(System.in);
	abstract void pay();
	
}
class Upi extends Pay
{
	void pay()
	{
		System.out.println("Payment done through upi");
	}
}
class Creditcard extends Pay
{
	void pay()
	{
		System.out.println("Payment done through creditcard");
	}
}
class Debitcard extends Pay
{
	void pay()
	{
		System.out.println("Payment done through Debitcard");
	}
}
class Netbanking extends Pay
{
	void pay()
	{
		System.out.println("Payment done thorough Netbanking");
	}
} 
class Main
{
	static Scanner sc=new Scanner(System.in);
	void makepayment(Pay x,int n)
	{
		x.pay();	
	}
	public static void main(String[] args)
	{
		Main obj=new Main();
		System.out.println("enter 1 for upi /2 for creditcard/3 for debitcard/4 for netbanking");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:	
				Pay u=new Upi();
				obj.makepayment(u,n);
				break;
			case 2:
				Pay v=new Creditcard();
				obj.makepayment(v,n);
				break;
			case 3:
				Pay w=new Debitcard();
				obj.makepayment(w,n);
				break;
			case 4:
				Pay z=new Netbanking();
				obj.makepayment(z,n);
				break;
			default:
				System.out.println("invalid input");
		}
	}
}






