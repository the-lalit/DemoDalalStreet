package polymorphismPrograms;

public class Pune extends Mumbai {
	
	public void vadapav()
	{
		System.out.println("vadapav method from Pune");
	}
	public void bollywood()
	{
		System.out.println("bollywood method from Pune");
	}
	
	public static void main(String args[])
	{
		Pune p =new Pune();
		p.vadapav();
		p.bollywood();
	
		p.vadapav();
		p.bollywood();
		p.tajhotel();

		
	}
}
