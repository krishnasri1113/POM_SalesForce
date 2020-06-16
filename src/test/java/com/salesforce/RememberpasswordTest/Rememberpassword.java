package com.salesforce.RememberpasswordTest;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.salesforce.POMLogin.POM_Login;
import com.salesforce.POM_Rememberpassword.POM_Rememberpassword;
import com.salesforce.utilites.TestBase;

public class Rememberpassword  extends TestBase{
	POM_Login login;
	POM_Rememberpassword Rememberpassword ;
	 Logger log=Logger.getLogger(getClass().getSimpleName());
		

	@BeforeTest
	public void SettingtheEnvironment() throws Exception {
		driver.get(System.getProperty("QAEnvironmentURL"));
		login=new POM_Login(driver);
		Rememberpassword=new POM_Rememberpassword(driver);
		
	}
	
	@Test
	public void Remembering_username() throws Exception {
		login.loginToSalesForcewithValidCredentials();
		log.info("Login successfully");
		Rememberpassword.Remembertheuser();
		log.info("clicked on remember me");
		log.info("home page is displayed");
		Rememberpassword.logoutfromsalesforce();
		String actualresult=Rememberpassword.savedusername.getText();
		log.info(actualresult);
		Assert.assertEquals(actualresult, "krishnasri.d@salesforce.com");
	    
		
		
	}

}
