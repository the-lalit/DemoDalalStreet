package operatorsProg;

public class UnaryOperator {

	int a =12;
	
	public void Unary()
	{
		System.out.println(a++);
		System.out.println(a--);
		System.out.println(++a);
		System.out.println(--a);
	}
	
	public static void main (String []args)
	{
		UnaryOperator obj = new UnaryOperator();
		obj.Unary();
				
	}
	
}
