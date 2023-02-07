package assignmentPrograms;

public class LeapYear2 {

	public static void main(String[] args) {
		
		int y = 2022;
		
		if (y%400==0)
		{
			System.out.println("the year is leap year");
		}
		else if (y%100!=0)
		{
			System.out.println("the year is not a leap year");
		}
		else if (y%4==0)
		{
			System.out.println("the year is a leap year");
		}
		else
		{
			System.out.println("the year is not a leap year");

		}

	}

}
