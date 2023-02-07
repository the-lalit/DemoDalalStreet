package methodCalling;

public class Example1 {

	//method calling within class without argument
	
	//static method
	public static void test1 ()
	{
		int a = 2;
		int b = 3;
		int c = a+b;
		System.out.println(c);
	}
	
	//non static method
	
	public void test2()
	{
		float a= 10.5f;
		int b = 2;
		float c = a+b;
		System.out.println(c);			
	}
	
	public static void main (String []args)
	{
		Example1.test1();
		Example1 x = new Example1();
		x.test2();
	}
}

