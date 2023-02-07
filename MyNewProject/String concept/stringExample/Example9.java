package stringExample;

public class Example9 {

	public static void main(String[] args) {

		String s = "Harry Potter";
		
//		char a= s.charAt(11);
//		System.out.println(a);
		
		int l = s.length();
		System.out.println(l);
		
		for(int i=l-1; i>=0; i--)
		{
			char b = s.charAt(i);
			System.out.print(b);

		}
		
	}

}
