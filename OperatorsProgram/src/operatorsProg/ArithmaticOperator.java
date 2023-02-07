package operatorsProg;

public class ArithmaticOperator {

	int a = 10;
	int b = 5;
	
	public void Arithmatic()
	{
		System.out.println (a+b);
		System.out.println (a-b);
		System.out.println (a*b);
		System.out.println (a/b);
		System.out.println (a%b);

	}
	
	public static void main (String args [])
	{
		ArithmaticOperator obj = new ArithmaticOperator();
		obj.Arithmatic();		
				
	}
}
