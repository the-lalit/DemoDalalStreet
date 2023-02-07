package basicTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Sample2 {
	
	@Test(priority =2)
	public void mnp()
	{
		System.out.println("method mnp");
	}
	@Test(priority =1)
	public void xyz()
	{
		System.out.println("method xyz");
	}
	@Test(priority =3)
	public void abc()
	{
		System.out.println("method abc");
	}

}
