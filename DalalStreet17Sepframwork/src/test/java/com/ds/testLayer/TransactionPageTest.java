package com.ds.testLayer;

import org.testng.annotations.Test;

import com.ds.pageLayer.Dashboard;
import com.ds.pageLayer.LoginPage;
import com.ds.pageLayer.TransactionPage;
import com.ds.testBase.TestBase;
import com.ds.utilities.UtilClass;

public class TransactionPageTest extends TestBase {

	@Test
	public void verifytransactionpage() throws InterruptedException
	{
		//------login-----------
		LoginPage login_obj = new LoginPage(driver);
		Dashboard dash_obj = new Dashboard(driver);
		UtilClass util_obj = new UtilClass();
		TransactionPage trans_obj = new TransactionPage(driver);
		login_obj.enterEmailAddress("lschaudhari30@gmail.com");
		login_obj.enterpassword("Lalit@123");
		login_obj.clickon_loginbtn();
		Thread.sleep(5000);
		
		//-----transaction page will open and get data in console 
		dash_obj.clickontransactionbtn();
		trans_obj.getData();
		trans_obj.getAllData();
	}
}
