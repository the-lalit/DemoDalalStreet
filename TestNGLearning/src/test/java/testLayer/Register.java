package testLayer;

import org.testng.annotations.Test;

public class Register {

	@Test(groups = {"Sanity testing"})
	public void test4()
	{
		System.out.println("test 4 method");
	}
	@Test(groups = {"Functional testing"})
	public void test5()
	{
		System.out.println("test 5 method");
	}
	@Test(groups = {"Regression testing"})
	public void test6()
	{
		System.out.println("test 6 method");
	}
}
