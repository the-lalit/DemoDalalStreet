package methodCalling;

public class Example2 {
	
	//method calling within class with argument
	
	//static method
	public static void test1(int a, int b)
	{
		System.out.println(a+b);
	}
	//non static method
	public void test2(int a, int b)
	{
		System.out.println(a*b);
	}
	
	public static void main (String []args)
	{
		Example2.test1(5, 2);
		Example2 x=new Example2 ();
		x.test2(3,4);
		
	}
	
	
	

}
