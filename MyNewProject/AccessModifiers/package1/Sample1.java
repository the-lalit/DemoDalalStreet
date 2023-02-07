package package1;

public class Sample1 {
	
	public int a=20;
	
	public void test ()
	{
		System.out.println("test method");
	}
	public Sample1()
	{
		System.out.println("sample1 constructor");
	}
	public static void main (String args[])
	{
		Sample1 x=new Sample1();
		x.test();
		System.out.println(x.a);
	}

}
