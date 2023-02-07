package systemInterface;

public interface Maruti implements car {
	
	public void start()
	{
		System.out.println ("Start");
	}
	public void stop()
	{
		System.out.println ("Stop");
	}
	public void wheels()
	{
		System.out.println ("Wheels");
	}
	public void redcolour()
	{
		System.out.println ("redcolour");
	}
	public static void main (String args[])
	{
		Maruti m = new Maruti();
		m.start();
		m.stop();
		m.wheels();
		m.redcolour();
	}

}
