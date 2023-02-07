package stringLogical;

public class ReverseEachWord {

	public static void main(String[] args) {
	
		String str = "I am Lalit ";
		String word = "";
		String rev = "";
		//str=str + " ";
		System.out.println (str.length());
		
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch != ' ')
			{
				word = word+ch;
			}
			else
			{
				rev = word + " " + rev;
				word = "";
			}
		}
		System.out.println(rev);

	}

}
