package stringLogical;

public class ReverseString {
	
	public static void main (String args[]) {
		
//		String s = "Harry Potter";
//		
//		int l = s.length();
//		System.out.println(l);
//		
//		for(int i=l-1; i>=0; i--)
//		{
//			char b = s.charAt(i);
//			System.out.print(b);
//
//		}
		
		StringBuffer sb = new StringBuffer("Lalit");
		StringBuffer b = sb.reverse();
		System.out.println(b);
	}

}
