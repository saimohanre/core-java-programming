class M
{
	int m1(Boolean c)
	{
		System.out.println(c);
		return 202;
	}
	void m2(int b)
	{
		System.out.println(b);
	}
	float m3()
        {
		System.out.println("enjoy");
		return 20.0f;
	}
	void m4()
	{
		System.out.println("sai");
	}
	public static void main(String[] args)
	{
		M sai=new M();
		System.out.println(sai.m1(true));
		M amar=new M();
		amar.m2(30);
		M siva=new M();
		System.out.println(siva.m3());
		M nag=new M();
		nag.m4();
	}
}