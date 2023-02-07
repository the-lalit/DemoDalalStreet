package testLayer;

import org.testng.annotations.Test;

public class LoginPage {

	@Test(groups = {"Sanity testing"})
	public void test7()
	{
		System.out.println("test 7 method");
	}
	@Test(groups = {"Functional testing"})
	public void test8()
	{
		System.out.println("test 8 method");
	}
	@Test(groups = {"Regression testing"})
	public void test9()
	{
		System.out.println("test 9 method");
	}
}
