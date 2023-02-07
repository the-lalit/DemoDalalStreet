package assignmentPrograms;

public class FibonacciSeries {
	
	public static void main (String args[])
	{
		int count =15;
		int firstterm = 0;
		int secondterm = 1;
		
		for(int i=1;i<=count;i++)
		{
			int resultterm = firstterm + secondterm;
			firstterm=secondterm;
			secondterm=resultterm;
			System.out.println(resultterm);
		}
		
		
	}

}
