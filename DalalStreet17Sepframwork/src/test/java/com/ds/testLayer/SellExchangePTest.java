package com.ds.testLayer;

import org.testng.annotations.Test;

import com.ds.pageLayer.Dashboard;
import com.ds.pageLayer.LoginPage;
import com.ds.pageLayer.SellExchangePage;
import com.ds.testBase.TestBase;

public class SellExchangePTest extends TestBase {
	
	@Test
	public void verifysellfunction() throws InterruptedException
	{
		//------login-----------
				LoginPage login_obj = new LoginPage(driver);
				login_obj.enterEmailAddress("lschaudhari30@gmail.com");
				login_obj.enterpassword("Lalit@123");
				login_obj.clickon_loginbtn();
				Thread.sleep(5000);
				//-------sell function----
				Dashboard dash_obj = new Dashboard(driver);
				dash_obj.searchstock("Wipro");
				dash_obj.clickonstock();
				Thread.sleep(3000);
				//------sell share now--------
				SellExchangePage sell_obj = new SellExchangePage (driver);
				sell_obj.clickonsellbutton();
				sell_obj.enterquantity("2");
				sell_obj.clickonsellbutton2();			
	}
	
	@Test
	public void verifysellfunctionwithcustomprice() throws InterruptedException
	{
		//------login-----------
				LoginPage login_obj = new LoginPage(driver);
				login_obj.enterEmailAddress("lschaudhari30@gmail.com");
				login_obj.enterpassword("Lalit@123");
				login_obj.clickon_loginbtn();
				Thread.sleep(5000);
				//-------sell function----
				Dashboard dash_obj = new Dashboard(driver);
				dash_obj.searchstock("Wipro");
				dash_obj.clickonstock();
				Thread.sleep(3000);
				//------sell share now--------
				SellExchangePage sell_obj = new SellExchangePage (driver);
				sell_obj.clickonsellbutton();
				sell_obj.clickoncustombtn();
				sell_obj.enterquantity("2");
				sell_obj.providecustomprice("350");
				sell_obj.clickonsellbutton2();			
	}
	
	@Test
	public void verifysellfunctionwithintradaymarket() throws InterruptedException
	{
		//------login-----------
				LoginPage login_obj = new LoginPage(driver);
				login_obj.enterEmailAddress("lschaudhari30@gmail.com");
				login_obj.enterpassword("Lalit@123");
				login_obj.clickon_loginbtn();
				Thread.sleep(5000);
				//-------sell function----
				Dashboard dash_obj = new Dashboard(driver);
				dash_obj.searchstock("Wipro");
				dash_obj.clickonstock();
				Thread.sleep(3000);
				//------sell share now--------
				SellExchangePage sell_obj = new SellExchangePage (driver);
				sell_obj.clickonsellbutton();
				sell_obj.clickonintradaybtn();
				Thread.sleep(2000);
				sell_obj.enterquantity("2");
				sell_obj.clickonsellbutton2();			
	}
	
	@Test
	public void verifysellfunctionwithIntradayCustom() throws InterruptedException
	{
		//------login-----------
				LoginPage login_obj = new LoginPage(driver);
				login_obj.enterEmailAddress("lschaudhari30@gmail.com");
				login_obj.enterpassword("Lalit@123");
				login_obj.clickon_loginbtn();
				Thread.sleep(5000);
				//-------sell function----
				Dashboard dash_obj = new Dashboard(driver);
				dash_obj.searchstock("Wipro");
				dash_obj.clickonstock();
				Thread.sleep(3000);
				//------sell share now--------
				SellExchangePage sell_obj = new SellExchangePage (driver);
				sell_obj.clickonsellbutton();
				sell_obj.clickonintradaybtn();
				sell_obj.clickoncustombtn();
				Thread.sleep(2000);
				sell_obj.enterquantity("2");
				sell_obj.providecustomprice("360");
				sell_obj.clickonsellbutton2();			
	}

}
