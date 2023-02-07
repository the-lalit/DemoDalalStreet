package assignmentPrograms;

public class ReverseNumber{
	
	public static void main (String args[])
	{
	int num = 1234;
	int  rem;
	int x=0;
	
	while(num>0)
		{
		   rem = num%10;
		   x= x*10+rem;
		   num= num/10;
		}
	System.out.println(x);
}

}
