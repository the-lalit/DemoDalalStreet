package stringExamplesNew;

public class Example2 {

	
	 //endswith method, indexof method, 
	public static void main(String[] args) {

		String s3= "My name is david warner";
		
		boolean a = s3.endsWith("e");
		System.out.println (a);
		
		int b = s3.indexOf('a');
		System.out.println (b);
		
		int c = s3.indexOf('n',4);
		System.out.println (c);
		
		int d = s3.indexOf("warner", 2);
		System.out.println (d);


	}
	

}
