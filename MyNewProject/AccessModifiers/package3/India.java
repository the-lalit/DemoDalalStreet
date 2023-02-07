package package3;

public class India {
	
	private int a=20;
	
	private void test()
	{
		System.out.println("test method");
	}
	India()
	{
		System.out.println("india constructor");
	}
	public static void main (String args[])
	{
		India o = new India();
		o.test();
		System.out.println(o.a);

	}

}
