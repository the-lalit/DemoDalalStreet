package inheritanceSingleLevel;

public class Child extends Parent{
	
	public void bike ()
	{
		System.out.println ("Childs bike");
	}
	public void laptop ()
	{
		System.out.println ("Childs laptop");
	}
	
	public static void main (String args[])
	{
		Child c = new Child();
		c.bike();
		c.laptop ();
		//
		Parent p = new Parent ();
		p.farm();
		p.cars();
		p.house();
	}
	

}
