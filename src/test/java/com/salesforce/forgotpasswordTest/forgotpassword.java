package com.salesforce.forgotpasswordTest;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.salesforce.POMLogin.POM_Login;
import com.salesforce.POM_forgotpasswordlink.POM_forgotpasswordlink;
import com.salesforce.utilites.TestBase;

public class forgotpassword  extends TestBase {
	
	POM_forgotpasswordlink forgotpassword;
	 Logger log=Logger.getLogger(getClass().getSimpleName());
		

	@BeforeTest
	public void SettingtheEnvironment() throws Exception {
		driver.get(System.getProperty("QAEnvironmentURL"));
		forgotpassword=new POM_forgotpasswordlink(driver);
		
	}
	@Test
	public void forgotpassword()
	{
		forgotpassword.forgot_password_link();
		log.info("clicked on forgot password");
		forgotpassword.sendusername();
		log.info("sent the username");
		log.info("clicked on continue button");
		String actualresult=driver.getCurrentUrl();
		String expectedresult="https://login.salesforce.com/secur/forgotpassword.jsp";
		Assert.assertEquals(actualresult, expectedresult);
	}

}
