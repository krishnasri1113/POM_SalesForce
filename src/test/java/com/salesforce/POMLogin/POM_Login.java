package com.salesforce.POMLogin;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.salesforce.utilites.TestBase;

public class POM_Login extends TestBase {
	 Logger log=Logger.getLogger(getClass().getSimpleName());
		
	public POM_Login(WebDriver driver){
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
@FindBy(xpath="//a[@class='switch-to-lightning']")
WebElement switchToligtexp;
@FindBy(xpath="//img[@id='phHeaderLogoImage']")
public WebElement LoginPagetitle;
public  void loginToSalesForcewithValidCredentials() throws Exception
{
	 
	 brwutil.waitElementToVisible(Username);
	 brwutil.ufSendKeys(Username, System.getProperty("username"));
	 log.info("Entered valid username");
    brwutil.waitElementToVisible(Password);
	 brwutil.ufSendKeys(Password,System.getProperty("password"));
	 log.info("Enetered valid password");
	 brwutil.waitElementToVisible(loginbutton);
    brwutil.ufclick(loginbutton);
    log.info("login button clicked");
    brwutil.waitElementToVisible(switchToligtexp);
	 
}

}
