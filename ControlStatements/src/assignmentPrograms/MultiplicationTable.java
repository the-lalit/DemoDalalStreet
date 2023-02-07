package assignmentPrograms;

public class MultiplicationTable {
	
	public static void main (String args[])
	{
		int a = 1;
		
		for (int i=1;i<=10;i++)
		{
			for (int j=1;j<=10;j++)
			{
				a=i*j;
				System.out.print(a+" ");
			}
			System.out.println(  );
		}
	}

}
