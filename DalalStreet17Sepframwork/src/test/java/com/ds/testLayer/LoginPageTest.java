package com.ds.testLayer;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ds.pageLayer.LoginPage;
import com.ds.pageLayer.SignupPage;
import com.ds.testBase.TestBase;
import com.ds.utilities.UtilClass;

public class LoginPageTest extends TestBase{
	
	@Test
	public void verifyLoginWithCorrectCred() throws InterruptedException
	{
//		String expected_output = "https://www.apps.dalalstreet.ai/dashboard";
		
		LoginPage login_obj = new LoginPage(driver);
		UtilClass util_obj = new UtilClass();
		login_obj.enterEmailAddress("thefilmylalit@gmail.com");
		login_obj.enterpassword("Lalit1995");
		login_obj.clickon_loginbtn();
		Thread.sleep(3000);
		//login_obj.ClickOnSignUp_btn();
		System.out.println("Lalit");
		
//		SignupPage signup_obj = new SignupPage(driver);
//		signup_obj.enterFirstName("Lalit");
//		signup_obj.enterLastName("Chaudhari");
//		signup_obj.enterEmail("thefilmylalit@gmail.com");
//		signup_obj.enterPass("Lalit1995");
//		signup_obj.clickoncheckbox();
//		signup_obj.clickonsubmit();
		

		
		Thread.sleep(3000);
//		String actual_output = util_obj.getWebPageUrl();
//		Assert.assertEquals(actual_output, expected_output);
		//driver.navigate().back();
	}

	
	

}
