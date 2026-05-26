class Q28
{
	static Q28 m1()      //Q28 is return type because of obj data type is Q28
	{
		Q28 obj=new Q28();
		return obj;
	}
	public static void main(String[] args)
	{
		System.out.println(m1());
	}

}