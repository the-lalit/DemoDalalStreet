package assignmentPrograms;

public class LeapYear {
	
	public static void main (String args[])
	{
		int y = 2000;
		
		if (y%100==0 && y%400==0 || y%100!=0 && y%4==0)
		{
			System.out.println ("Leap year");
		}
		else
		{
			System.out.println ("NOt Leap year");
		}
	}

}
