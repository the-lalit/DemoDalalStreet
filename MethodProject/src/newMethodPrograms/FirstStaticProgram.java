package newMethodPrograms;

public class FirstStaticProgram {

	public static void add ()
	{
		System.out.println(20+20);
		System.out.println(15+15);
	}
	
	public static void sub ()
	{
		System.out.println(5-2);
		System.out.println(10-5);
	}
	//main method
	public static void main (String []args)
	{
		FirstStaticProgram.add();   //call
		FirstStaticProgram.sub();   //call
	}

}

