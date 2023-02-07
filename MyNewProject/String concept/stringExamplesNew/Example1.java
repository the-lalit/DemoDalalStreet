package stringExamplesNew;

public class Example1 {

	// Concat method, contains method, contentEquals method
	public static void main(String[] args) {

		String s1= "Harry Potter";
		String s2= "james Potter";
		
		//System.out.println (s1+s2);
		System.out.println (s1.concat(s2));
		
		String s3= "My name is khan";
		boolean a = s3.contains("lalit");
		System.out.println(a);
		
		boolean b = s3.contentEquals("My name is khan");
		System.out.println(b);
	}

}
