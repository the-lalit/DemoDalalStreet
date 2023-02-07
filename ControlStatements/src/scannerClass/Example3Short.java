package scannerClass;

import java.util.Scanner;

public interface Example3Short {
	
	public static void main (String args [])
	{
		Scanner in = new Scanner (System.in);
		
		short a = in.nextShort();
		short b = in.nextShort();
		
		System.out.println("The value of a=" + a);
		System.out.println("The value of b=" + b);
	}
}