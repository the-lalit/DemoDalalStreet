package com.ds.testLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.ds.pageLayer.Dashboard;
import com.ds.pageLayer.ExchangePage;
import com.ds.pageLayer.LoginPage;
import com.ds.testBase.TestBase;

public class BuyFunctionalityTest extends TestBase{
	
	@Test
	public void VerifyBuyFunctionality() throws InterruptedException
	{
		//------login-----------
		LoginPage login_obj = new LoginPage(driver);
		login_obj.enterEmailAddress("lschaudhari30@gmail.com");
		login_obj.enterpassword("Lalit@123");
		login_obj.clickon_loginbtn();
		Thread.sleep(5000);
		//-------buy function----
		Dashboard dash_obj = new Dashboard(driver);
		dash_obj.searchstock("Wipro");
		dash_obj.clickonstock();
		Thread.sleep(3000);
		//-----exchange page-----
		ExchangePage exchange_obj = new ExchangePage(driver);
		exchange_obj.clickonbuybtn1();
		exchange_obj.selectquantity("2");
		exchange_obj.clickonbuybtn2();
		
	}
	
	@Test
	public void VerifyBuyFunctionalitywithlongtermcustomlimit() throws InterruptedException
	{
		//------login-----------
				LoginPage login_obj = new LoginPage(driver);
				login_obj.enterEmailAddress("lschaudhari30@gmail.com");
				login_obj.enterpassword("Lalit@123");
				login_obj.clickon_loginbtn();
				Thread.sleep(5000);
		//-------buy function----
				Dashboard dash_obj = new Dashboard(driver);
				dash_obj.searchstock("Wipro");
				dash_obj.clickonstock();
				Thread.sleep(3000);
		//-----exchange page-----
				ExchangePage exchange_obj = new ExchangePage(driver);
				exchange_obj.clickonbuybtn1();
				exchange_obj.clickoncustom();
				exchange_obj.selectquantity("2");
				exchange_obj.enteryourprice("300");
				exchange_obj.clickonbuybtn2();
	}

	@Test
	public void VerifyBuyFunctionalitywithIntrdayMarket() throws InterruptedException
	{
		//------login-----------
			    LoginPage login_obj = new LoginPage(driver);
				login_obj.enterEmailAddress("lschaudhari30@gmail.com");
				login_obj.enterpassword("Lalit@123");
				login_obj.clickon_loginbtn();
				Thread.sleep(5000);
		//-------buy function----
				Dashboard dash_obj = new Dashboard(driver);
				dash_obj.searchstock("Wipro");
				dash_obj.clickonstock();
				Thread.sleep(3000);
				
		//-----exchange page-----
		ExchangePage exchange_obj = new ExchangePage(driver);
		exchange_obj.clickonbuybtn1();
		exchange_obj.clickonintrdaybtn();
		exchange_obj.selectquantity("2");
		exchange_obj.clickonbuybtn2();
							
				
	}
	@Test
	public void VerifyBuyFunctionalitywithIntrdayCustomt() throws InterruptedException
	{
		//------login-----------
			    LoginPage login_obj = new LoginPage(driver);
				login_obj.enterEmailAddress("lschaudhari30@gmail.com");
				login_obj.enterpassword("Lalit@123");
				login_obj.clickon_loginbtn();
				Thread.sleep(5000);
		//-------buy function----
				Dashboard dash_obj = new Dashboard(driver);
				dash_obj.searchstock("Wipro");
				dash_obj.clickonstock();
				Thread.sleep(3000);
				
		//-----exchange page-----
		ExchangePage exchange_obj = new ExchangePage(driver);
		exchange_obj.clickonbuybtn1();
		exchange_obj.clickonintrdaybtn();
		exchange_obj.clickoncustom();
		exchange_obj.selectquantity("2");
		exchange_obj.enteryourprice("300");
		exchange_obj.clickonbuybtn2();
							
				
	}


}
