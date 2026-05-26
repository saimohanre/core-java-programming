class D
{
	void m1()
	{
		System.out.println("hi");
	}
}
class E extends D
{
	 void m1()
	{
		super.m1();
		System.out.println("");
	}
	public static void main(String[] args)
	{
		E obj=new E();
		obj.m1();
	}
}