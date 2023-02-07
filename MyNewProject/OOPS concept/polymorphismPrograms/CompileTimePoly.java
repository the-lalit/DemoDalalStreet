package polymorphismPrograms;

public class CompileTimePoly {
	
	public void test1()
	{
		System.out.println("test 1 method without argument");
	}
	public void test1(int a)
	{
		System.out.println("test 1 method with int argument");
	}
	public void test2()
	{
		System.out.println("test 2 method without argument");
	}
	public void test2(String n)
	{
		System.out.println("test 2 method with string argument");
	}
	
	public static void main (String args[])
	{
		CompileTimePoly d = new CompileTimePoly();
		d.test1();
		d.test1(20);
		d.test2();
		d.test2("Lalit");
	}

}
