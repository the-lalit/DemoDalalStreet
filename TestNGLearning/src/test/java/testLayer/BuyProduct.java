package testLayer;

import org.testng.annotations.Test;

public class BuyProduct {

	@Test(groups = {"Sanity testing"})
	public void test1()
	{
		System.out.println("test 1 method");
	}
	@Test(groups = {"Functional testing"})
	public void test2()
	{
		System.out.println("test 2 method");
	}
	@Test(groups = {"Regression testing"})
	public void test3()
	{
		System.out.println("test 3 method");
	}
}
