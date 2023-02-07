package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleEx {
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before suite method");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("After suite method");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Before test method");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("After test method");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before class method");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("After class method");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method method");
	}
	
	
	@Test
	public void test1()
	{
		System.out.println("Test1 method");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test2 method");
	}


}
