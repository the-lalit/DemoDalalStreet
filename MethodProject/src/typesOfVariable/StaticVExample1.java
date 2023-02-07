package typesOfVariable;

public class StaticVExample1 {
    static int a= 20;
	static int b= 30;
	
	//static method
	
	public static void add ()
	{
		int c = a+b;
		System.out.println (c);
	}
	
	//non static method
	public void mul ()
	{
		int d = a*b;
		System.out.println(d);
	}
	//calling
	public static void main (String []args)
	{
		StaticVExample1.add();
		StaticVExample1 x =new StaticVExample1 ();
		x.mul();
		
	}
	
}
