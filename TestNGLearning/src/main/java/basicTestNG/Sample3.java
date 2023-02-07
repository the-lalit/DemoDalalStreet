package basicTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Sample3 {
	
	@Test (priority = -1)
	public void xyz()
	{
		System.out.println("xyz method");
	}
	
	@Test (priority = 3,invocationCount = 5,dependsOnMethods = {"xyz","abc"})
	public void mnp()
	{
		System.out.println("mnp method");
	}
	
	@Test (timeOut = 6000)
	public void abc()
	{
		System.out.println("abc method");
	}


}
