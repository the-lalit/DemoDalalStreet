package decisionMaking;

public class VerifySalary {

	public static void main(String[] args) {
	
		int age = 39;

		if ((age>=21)&&(age<=25))
		{
			System.out.println ("then the salary is 30,000");
		}
		else if ((age>=26)&&(age<=30))
		{
			System.out.println ("then the salary is 40,000");
		}
		else if ((age>=31)&&(age<=35))
		{
			System.out.println ("then the salary is 50,000");
		}
		else if ((age>=36)&&(age<=40))
		{
			System.out.println ("then the salary is 60,000");
		}
		else 
		{
			System.out.println ("then the salary is 70,000");
		}
	}

}
