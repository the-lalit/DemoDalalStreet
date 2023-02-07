package newMethodPrograms;

public class FirstNonstaticProgramAddition {

	//Non-static method
	public void addition()
	{
		System.out.println(10+5);
	}
	
	public static void main (String []args)
	{
		//object creation
		FirstNonstaticProgramAddition x = new FirstNonstaticProgramAddition();
		x.addition();
	}
	
}
	