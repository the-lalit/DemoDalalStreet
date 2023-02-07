package com.ds.testLayer;

import org.testng.annotations.Test;

import com.ds.pageLayer.AnotherExchgPage;
import com.ds.pageLayer.Dashboard;
import com.ds.pageLayer.LoginPage;
import com.ds.testBase.TestBase;

public class ExchangesPtest extends TestBase {

	@Test
	public void VerifyExchangePageFunctions() throws InterruptedException
	{
		//------login-----------
		LoginPage login_obj = new LoginPage(driver);
		login_obj.enterEmailAddress("lschaudhari30@gmail.com");
		login_obj.enterpassword("Lalit@123");
		login_obj.clickon_loginbtn();
		Thread.sleep(5000);
		
		Dashboard dash_obj = new Dashboard(driver);
		dash_obj.clickonExchangebtn();
		
		//------buy crypto------
		AnotherExchgPage crypto_obj = new AnotherExchgPage(driver);
		crypto_obj.clickoncryptobtn();
		crypto_obj.clickongmxcrypto();
	}
}
