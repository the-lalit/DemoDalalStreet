package decisionMaking;

public class MarksGrade {
	
	public static void main (String args[])
	{
		int mark = 75;
		
		if ((mark>=61&&(mark<=74)))
		{
			System.out.println("Candidate is in first class");
		}
		else if ((mark>=41&&(mark<=60)))
		{
			System.out.println("Candidate is in second class");
		}
		else if ((mark>=35&&(mark<=40)))
		{
			System.out.println("Candidate is in pass class");
		}
		else
		{
			System.out.println("Candidate is in distinction");
		}
	}

}
