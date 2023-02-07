package constructorPrograms;

public class Sample3 {
	
	Sample3()
	{
		System.out.println("constructor without argument");
	}
	
	Sample3(int a, int b, String c)
	{
		System.out.println ("constructor with argument hav 2int 1string");
	}
	
	Sample3(int b)
	{
		System.out.println("constructor with argument 1int");
	}
	public static void main(String []args)
	{
		Sample3 x= new Sample3();
		Sample3 y = new Sample3(10,20,"velocity");
		Sample3 z = new Sample3 (50);
	}

}
