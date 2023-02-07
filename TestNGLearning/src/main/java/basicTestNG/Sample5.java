package basicTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Sample5 {
	
	@Test (priority = -10)
	public void xyz()
	{
		System.out.println("xyz method");
		System.out.println(4/2);
	}
	
	@Test (dependsOnMethods = {"xyz"})
	public void mnp()
	{
		System.out.println("mnp method");
	}
	
	@Test (dependsOnMethods = {"mnp"})
	public void rst()
	{
		System.out.println("abc method");
	}
	
	
	@Test
	public void abc()
	{
		System.out.println("abc method");
	}


}
