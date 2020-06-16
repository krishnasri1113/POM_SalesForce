package com.salesforce.InvalidLogin;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.salesforce.POMLogin.POM_Login;
import com.salesforce.POM_LoginwithInvalidCredentials.POM_InvalidLogin;
import com.salesforce.utilites.TestBase;

public class SalesForceInvalidLogin  extends TestBase{
	POM_InvalidLogin invalidlogin;
	Logger log=Logger.getLogger(getClass().getSimpleName());
	

	@BeforeTest
	public void SettingtheEnvironment() throws Exception {
		driver.get(System.getProperty("QAEnvironmentURL"));
		invalidlogin=new POM_InvalidLogin(driver);
		
	}
	
	@Test
	public void checkLoginInvalidcredentials() throws Exception {
		invalidlogin.loginToSalesForcewithInValidCredentials();
		log.info("log in not successfull");
		String expectedresult="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		log.info(expectedresult);
		String Actualressult=invalidlogin.error_msg.getText();
		Assert.assertEquals(Actualressult, expectedresult);
		
		
		
	}


}
