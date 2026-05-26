import java.util.*;
class LimitedExceededException extends Exception
{
	public LimitedExceededException(String msg)
	{
		super(msg);
	}
}
class Bank 
{
	static Scanner sc=new Scanner(System.in);
	double limit=100000;
	void transaction(double amt) throws LimitedExceededException
	{
		if(amt<=limit)
		{
			limit=limit-amt;
			System.out.println("transaction sucessfull");
		}
		else
		{
			LimitedExceededException obj=new LimitedExceededException("/limit exceeded,24 hrs");
			throw obj;
		}
	}
	public static void main(String[] args) throws LimitedExceededException
	{
		Bank x=new Bank();
		x.transaction(sc.nextDouble());
	}
}		

