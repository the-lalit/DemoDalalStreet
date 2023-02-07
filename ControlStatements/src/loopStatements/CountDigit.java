package loopStatements;

public class CountDigit {

	public static void main (String args [])
	{
		int count = 0, num=85423;
		
		for (int i= 1; num>0 ; i++)
		{
			num=num/10;
			count++;
			System.out.println(i);
		}
	}
}
 