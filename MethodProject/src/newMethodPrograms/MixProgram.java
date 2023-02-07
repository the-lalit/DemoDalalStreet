package newMethodPrograms;

public class MixProgram {
    //Static Method
	public static void add ()
	{
		System.out.println(5+100);
	}
	
	//Non-static method
		public void addition()
		{
			System.out.println(10+5);
		}
		
		//main method
		public static void main (String []args)
		{
			MixProgram.add();   //call
			MixProgram x = new MixProgram();
			x .addition();
		}
	
}
