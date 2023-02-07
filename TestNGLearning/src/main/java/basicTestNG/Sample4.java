package basicTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Sample4 {
	
	@Test (priority = -1)
	public void xyz()
	{
		System.out.println("xyz method");
	}
	
	@Test (priority = 3)
	public void mnp()
	{
		System.out.println("mnp method");
	}
	
	@Test (invocationCount = 5)
	public void abc()
	{
		System.out.println("abc method");
	}


}
