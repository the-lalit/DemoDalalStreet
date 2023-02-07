package stringLogical;

public class PalindromOrNot {

	public static void main(String[] args) {
		
		String str = "nitin";
		System.out.println ("input string = " +str);
		String p = "";
		
		int l = str.length();
		System.out.println ("length = " +l);
		
		for (int i=0; i<str.length(); i++)
		{
			char ch= str.charAt(i);
			p=ch+p;
		}
		if(str.equals(p))
		{
			System.out.println ("String is palindrom");
		}
		else
		{
			System.out.println ("String is not palindrom");

		}
	}

}
