package abc;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample1 {
	
	public void xyz()
	{
		System.out.println("-------1----------");
		System.out.println("-------2----------");
		
		int a = 10; int b = 15; int c = a+b;
		Assert.assertEquals(c, 20);
		
		System.out.println("-------3----------");
		System.out.println("-------4----------");
	}
	
	@Test
	public void mnp()
	{
		System.out.println("-------5----------");
		System.out.println("-------6----------");
		int a = 10; int b = 15; int c = a+b;
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(c, 20);
		
		System.out.println("-------7----------");
		System.out.println("-------8----------");
		soft.assertAll();
	}


}
