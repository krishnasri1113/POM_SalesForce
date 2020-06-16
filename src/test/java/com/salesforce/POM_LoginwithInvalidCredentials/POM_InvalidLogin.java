package com.salesforce.POM_LoginwithInvalidCredentials;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.salesforce.utilites.TestBase;

public class POM_InvalidLogin  extends TestBase{
	 Logger log=Logger.getLogger(getClass().getSimpleName());
	 
		
	public POM_InvalidLogin(WebDriver driver){
        TestBase.driver = driver;
	       //This initElements method will create all WebElements
         PageFactory.initElements(driver, this);

}   
@FindBy(xpath="//input[@id='username']")
WebElement Username;
@FindBy(xpath="//input[@id='password']")
WebElement Password;
@FindBy(xpath="//input[@value='Log In']")
WebElement loginbutton;
@FindBy(xpath="//div[@id='error']")
 public WebElement error_msg;
@FindBy(xpath="//img[@id='phHeaderLogoImage']")
public WebElement LoginPagetitle;


public  void loginToSalesForcewithInValidCredentials() throws Exception
{
	 
	 brwutil.waitElementToVisible(Username);
	 brwutil.ufSendKeys(Username, System.getProperty("wrongusername"));
	 log.info("Entered wrong username");
    brwutil.waitElementToVisible(Password);
	 brwutil.ufSendKeys(Password,System.getProperty("wrongpassword"));
	 log.info("Entered wrong password");
	 brwutil.waitElementToVisible(loginbutton);
    brwutil.ufclick(loginbutton);
    log.info("login button clicked");
    brwutil.waitElementToVisible(error_msg);
    brwutil.waitElementToVisible(LoginPagetitle);

}
}
