package stringExamplesNew;

public class Example4 {

	public static void main(String[] args) {

		String s3= "Harry is James aPotter";
		String a = s3.replaceFirst("is","was");
		System.out.println(a);
		
		String[] b = s3.split("james");
		System.out.println(b);

		String[] c = s3.split("a",8);
		int cl = b.length;
		
		for (int i=0;i<cl;i++)
		{
			System.out.println(c[i]);
		}
	}

}
