package assignmentPrograms;

public class LargestNoAmong3 {

	public static void main(String[] args) {
		
		int n1 = 60;
		int n2 = 85;
		int n3 = 59;
		if (n1>=n2 && n1>=n3)
		{
			System.out.println ("n1 is the largest number");
		}
		else if (n2>=n1 && n2>=n3)
		{
			System.out.println ("n2 is the largest number");
		}
		else 
		{
			System.out.println ("n3 is the largest number");
		}

	}

}
