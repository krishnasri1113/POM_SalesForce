package com.salesforce.utilites;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
@Listeners(com.salesforce.Listeners.TestListener.class)			

public class TestBase {
	public static WebDriver driver=null;
	 public static BrowserUtilites brwutil=new BrowserUtilites();
	 public static commonUtilites commonutil=new commonUtilites();
	public static String sclassNameForScreenShot=null;
	 Logger log=Logger.getLogger(getClass().getSimpleName());
	
	@BeforeSuite
	public  void LoadData() throws Exception
	{
		
		commonutil.loadPropertyfiles(System.getProperty("user.dir")+"/src/main/java/Properties/TestData.properties");
		commonutil.loadlog4jproperties(System.getProperty("user.dir")+"/src/main/java/Properties/Log4j.properties");
		commonutil.loadconfigproperties(System.getProperty("user.dir")+"/src/main/java/Properties/Config.properties");
		log.info("launching the browser");
	     brwutil.launchbrowser("ch");
		
	}
	@AfterSuite
	public void quitbrowser() throws Exception
	{
		
		driver.quit();
	}

	

}
