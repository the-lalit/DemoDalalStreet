package stringExamplesNew;

public class Example3 {

	public static void main(String[] args) {

		String s3= "My name is david warner";
		
		//lastindex, repeatmethod, replacemethod, replaceall method
		
		int a= s3.lastIndexOf('a');
		System.out.println(a);
		
		String b = s3.repeat(3);
		System.out.println(b);
		
		String c= s3.replace('a', 'z');
		System.out.println(c);
		
		String d= s3.replace("warner", "miller");
		System.out.println(d);
		
		String e= s3.replaceAll("is", "was");
		System.out.println(e);





	}

}
