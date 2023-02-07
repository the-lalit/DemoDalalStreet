package operatorsProg;

public class LogicalOperator {

	int a= 20;
	int b =30;
	int c= 40;
	
	public void Logical()
	{
		System.out.println((a<b)&&(b<c)&&(a<c));
		System.out.println((a>b)||(b>c)||(c<a));
	}
	
	public static void main (String args[])
	{
		LogicalOperator obj = new LogicalOperator();
		obj.Logical();
	}
}
