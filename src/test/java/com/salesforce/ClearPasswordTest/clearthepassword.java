package com.salesforce.ClearPasswordTest;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.salesforce.POMLogin.POM_Login;
import com.salesforce.utilites.TestBase;

import pom.salesforce.POM_Passwordclear.POM_ClearThepassword;

public class clearthepassword  extends TestBase{
	POM_ClearThepassword clrpwd;
	 Logger log=Logger.getLogger(getClass().getSimpleName());
		

	@BeforeTest
	public void SettingtheEnvironment() throws Exception {
		driver.get(System.getProperty("QAEnvironmentURL"));
		clrpwd=new POM_ClearThepassword(driver);
		
	}
	@Test
	public void Clear_the_password() {
		clrpwd.clear_password();
		log.info("Entered Username");
		log.info("Entered the password");
		log.info("cleared the password");
		String actualresult=driver.findElement(By.id("error")).getText();
		String expectedresult="Please enter your password.";
		Assert.assertEquals(actualresult, expectedresult);
	}

}
