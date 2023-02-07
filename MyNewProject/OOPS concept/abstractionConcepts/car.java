package abstractionConcepts;

public abstract class car {

	car()
	{
		
	}
	public abstract void start();
	public abstract void stop ();
	
	public void wheels ()
	{
		System.out.println("4 wheeler");
	}
	public void exterior ()
	{
		System.out.println("exterior");
	}
	public static void test ()
	{
		System.out.println("static method");
	}
	public static void main (String args[])
	{
		//Car c = new Car();        ------- Always remember object creation is not possible
		car.test();
	}
	
}
