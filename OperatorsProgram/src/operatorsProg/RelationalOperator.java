package operatorsProg;

public class RelationalOperator {

	int a = 5;
	int b = 10;
	public void Relational ()
	{
		System.out.println (a<b);
		System.out.println (a>b);
		System.out.println (a<=b);
		System.out.println (a>=b);
		System.out.println (a==b);
		System.out.println (a!=b);
	}
	
	public static void main (String args[])
	{
		RelationalOperator obj = new RelationalOperator ();
		obj.Relational();
		
				
	}
}
