package com.salesforce.POM_forgotpasswordlink;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.salesforce.utilites.TestBase;

public class POM_forgotpasswordlink extends TestBase {
	 Logger log=Logger.getLogger(getClass().getSimpleName());
		
	public POM_forgotpasswordlink(WebDriver driver)
	{
		TestBase.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@id='forgot_password_link']")
	WebElement forgotpassword;
	public void forgot_password_link()
	{
		brwutil.waitElementToVisible(forgotpassword);
		brwutil.ufclick(forgotpassword);
	}
	@FindBy(xpath="//input[@id='un']")
	WebElement username;
	@FindBy(xpath="//input[@value='Continue']")
	WebElement continuebutton;
	public void sendusername()
	{
		brwutil.waitElementToVisible(username);
		brwutil.ufSendKeys(username, System.getProperty("username"));
		brwutil.waitElementToVisible(continuebutton);
		brwutil.ufclick(continuebutton);
	
	}

}
