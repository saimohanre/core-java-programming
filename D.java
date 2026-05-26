class D
{
	static int a=20;        //global static variable
	float b=10.0f;             //global non static variableh
	public static void main(String[] args)  //main method
        {
		int d=654;       //local variable
		System.out.println(a);
		System.out.println(d);
		D sai=new D(); //object cereation
		System.out.println(sai.b);   //object printing
	}
}