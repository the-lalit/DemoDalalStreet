package assignmentPrograms;

public class PalindromNumber {

	public static void main(String[] args) {
		
		int num = 121;
		int reversenumber = 0;
		int remainder; 
		int temp=num;
		
		while(num>0)
		{
			remainder=num%10;
			reversenumber=reversenumber*10 + remainder;
			num= num/10;
		}
		if(temp==reversenumber)
		{
			System.out.println ("the given number is palindrom");
		}
		else
		{
			System.out.println ("the given number is not palindrom");
		}

	}

}
