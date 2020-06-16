package pom.salesforce.POM_Passwordclear;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.salesforce.utilites.TestBase;

public class POM_ClearThepassword  extends TestBase{
	public POM_ClearThepassword(WebDriver driver)
	{
		TestBase.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='username']")
	WebElement Username;
	@FindBy(xpath="//input[@id='password']")
	WebElement Password;
	@FindBy(xpath="//input[@value='Log In']")
	WebElement loginbutton;
	
	public void clear_password()
	{
		brwutil.waitElementToVisible(Username);
		brwutil.ufSendKeys(Username, System.getProperty("username"));
		brwutil.waitElementToVisible(Password);
		brwutil.ufSendKeys(Password, System.getProperty("password"));
		Password.clear();
		brwutil.ufclick(loginbutton);
	}


}
