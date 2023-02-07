package stringLogical;

public class FormWordByExtractFirstLetter {

	public static void main(String[] args) {
		// java program to form a new word by extracting the first letter of each word in entered sentence
		
		String s = "My name is Lalit";
		String[] word = s.split(" "); 
		
		for (int i=0; i<word.length;i++)
		{
			String value = word[i];
			char c = value.charAt(0);
			System.out.print(c);
		}

	}

}
