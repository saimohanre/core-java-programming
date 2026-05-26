import java.util.*;
class LimitExceededException extends Exception
{
	public LimitExceededException(String msg)
	{
		super(msg);
	}
}
class Vote
{
	static Scanner sc=new Scanner(System.in);
	int limit=19;
	void m1(int age) throws LimitExceededException
	{
		if(age>18)
		{
			System.out.println("eligible to vote");
		}
		else
		{
			LimitExceededException obj=new LimitExceededException("/limit exceeded, they eligible to vote after 19");
			throw obj;
		}
	}
	public static void main(String[] args) throws LimitExceededException
	{
		Vote obj=new Vote();
		obj.m1(sc.nextInt());
	}
}