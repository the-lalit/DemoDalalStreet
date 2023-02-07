package stringExample;

import java.util.Scanner;

public class Example5 {

	//Java String charAt() Method using user input
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		System.out.println(a);
		
		char x1 = a.charAt(6);
		System.out.println(x1);
				
	}

}
