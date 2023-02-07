package typesOfVariable;

public class GlobalVExample1 {
	
	int a= 10;
	int b = 20;
	
	public void add ()
	{
		int c = a+b;
		System.out.println (c);
	}
	

	
    public static void  main (String []args)
    {
    	GlobalVExample1 x = new GlobalVExample1 ();
    	x.add();
    	
    }
}
