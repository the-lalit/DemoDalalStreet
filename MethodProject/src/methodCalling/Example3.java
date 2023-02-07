package methodCalling;

public class Example3 {

	//method calling within class with argument
	
	public static void sample1()
	{
		System.out.println ("Instagram reels");
	}
	
	public void test2()
	{
		System.out.println ("Youtube shorts");
	}
	
	public static void main (String[]args)
	{
		Example3.sample1();
		Example3 xyz= new Example3();
		xyz.test2();
	}
}
