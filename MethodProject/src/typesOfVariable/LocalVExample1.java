package typesOfVariable;

public class LocalVExample1 {

	//static method
	public static void add ()
	{
		int a = 20;
		int b = 40;
		int c = a+b;
		System.out.println (c);
	}
	
	//non static method
	public void sub()
	{
		int x= 10;
		int y = 5;
		int z = x-y;
		System.out.println(z);
	}
	//call functions
	public static void main (String []args)
	{
		LocalVExample1.add();
		LocalVExample1 m = new LocalVExample1();
		m.sub();
	}
}
