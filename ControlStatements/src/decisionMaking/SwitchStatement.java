package decisionMaking;

public class SwitchStatement {
	public static void main (String args[])
	{
		String city = "Delhi";
		
		switch (city)
		{
		case "Pune" : System.out.println ("I am from Pune");break;
		case "Mumbai" : System.out.println ("I am from Mumbai"); break;
		case "Nagpur" : System.out.println ("I am from Nagpur"); break;
		case "Delhi" : System.out.println ("I am from Delhi"); break;
		default : System.out.println ("I am from Other city"); break;
		}
	}

}
