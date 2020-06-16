package com.salesforce.POM_Rememberpassword;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.salesforce.utilites.TestBase;

public class POM_Rememberpassword extends TestBase {
	 public POM_Rememberpassword(WebDriver driver)
	 {
		 TestBase.driver=driver;
		 PageFactory.initElements(TestBase.driver,this);
	 }
	 @FindBy(xpath="//input[@id='username']")
	 WebElement Username;
	 @FindBy(xpath="//input[@id='password']")
	 WebElement Password;
	 @FindBy(xpath="//input[@value='Log In']")
	 WebElement loginbutton;
	 public void loginTosalesforce() {
		 brwutil.waitElementToVisible(Username);
		 brwutil.ufSendKeys(Username, System.getProperty("username"));
	    brwutil.waitElementToVisible(Password);
		 brwutil.ufSendKeys(Password,System.getProperty("password"));
		 brwutil.waitElementToVisible(loginbutton);
	    brwutil.ufclick(loginbutton);
	 }
	 @FindBy(xpath="//input[@name='rememberUn']")
	 WebElement Rememberme;
	  public void Remembertheuser() throws Exception {
		  brwutil.waitElementToVisible(Rememberme);
		  brwutil.ufclick(Rememberme);
	  }
	  @FindBy(xpath="//div[@id='userNavButton']")
	  WebElement usermenenu;
	  @FindBy(xpath="//a[contains(text(),'Logout')]")
	  WebElement logout;
	  @FindBy(xpath="//span[@id='idcard-identity']")
	public  WebElement savedusername;
	  public void logoutfromsalesforce() {
		  brwutil.waitElementToVisible(usermenenu);
		  brwutil.ufclick(usermenenu);
		  brwutil.waitElementToVisible(logout);
		  brwutil.ufclick(logout);
		  brwutil.waitElementToVisible(savedusername);
	  }
	

}
