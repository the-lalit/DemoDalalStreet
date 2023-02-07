package inheritanceMultilevel;

public class D extends C{
	
	public void method4()
	{
		System.out.println("method 4 from class D");
	}
	
	public static void main (String args[])
	{
		B b = new B();
		b.method1();
		b.method2();
		
		C c = new C();
		c.method1();
		c.method2();
		c.method3();
		
		D d = new D();
		d.method1();
		d.method2();
		d.method3();
		d.method4();
		
		
	}

}

