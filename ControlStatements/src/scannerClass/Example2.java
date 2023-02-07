package scannerClass;

import java.util.Scanner;

public class Example2 {
	
	public static void main (String args[])
	{
		Scanner in = new Scanner (System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		System.out.println ("The value of a =" +a);
		System.out.println ("The value of b =" +b);
		
		System.out.println (a+b);
	}

}
