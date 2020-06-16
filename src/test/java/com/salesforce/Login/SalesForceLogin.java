package com.salesforce.Login;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.salesforce.POMLogin.POM_Login;
import com.salesforce.utilites.TestBase;


  
public class SalesForceLogin extends TestBase {
	POM_Login login;
	 Logger log=Logger.getLogger(getClass().getSimpleName());
		

	@BeforeTest
	public void SettingtheEnvironment() throws Exception {
		driver.get(System.getProperty("QAEnvironmentURL"));
		login=new POM_Login(driver);
		
	}
	
	@Test
	public void checkLogin_success_or_not() throws Exception {
		login.loginToSalesForcewithValidCredentials();
		log.info("log in successfully");
		log.info("Home page is displayed");
		String actualresult=login.LoginPagetitle.getAttribute("title");
		log.info(actualresult);
		Assert.assertEquals(actualresult, "Salesforce.com");
	    
		
		
	}

}
