package stringLogical;

public class WordWithVowel {
	
	// Java program to enter a sentence and print the words which starting with a vowel
	
	public static void main(String[] args) {
		
		String s = "My name is Lalit";
		String sentence = s.toLowerCase();
		String[] word = sentence.split(" ");
		
		String value = "";
		
		for(int i=0; i<word.length; i++)
		{
			value = word[i];
			char ch = value.charAt(0);
			
			if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println("the word with vowel=" + value);
			}
			else
			{
				System.out.println("the word with consonent=" + value);
			}
		}
	

	}

}
