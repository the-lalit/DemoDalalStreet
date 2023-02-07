package constructorPrograms;

public class Sample2 {
	
	Sample2(int a)
	{
		System.out.println(20);
	}
	
	Sample2()
	{
		System.out.println("constructor without argument");
	}
	
	public static void main(String []args)
	{
		new Sample2 (1);
		new Sample2 ();
	}

}
