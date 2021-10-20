package recognition;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Kudosearch;
import pageObjects.Verifylogin;
import resources.Base;

public class Qt4 extends Base {
	@BeforeTest
	public void login() throws IOException
	{
			driver=initializeDriver();
			driver.get(prop.getProperty("url"));
			
			Verifylogin qt=new Verifylogin (driver);
		    qt.uname().sendKeys("sushmitha.v@qualitestgroup.com");
		    qt.pwd().sendKeys("P@ssw0rd"); 
		    qt.login().click();
	        
	}
   @Test
   public void search1()
   {
	   //to verify search kudo option present
	   Kudosearch s= new Kudosearch(driver);
	   
	  Assert.assertTrue(s.searchkudo().isDisplayed());
	   
   }
   
   @Test
   public void search2() throws InterruptedException
   {  
	   //user can send kudos by entering the valid emailadress
	   Kudosearch  s1= new Kudosearch(driver);
	   Thread.sleep(2000);
	   s1.searchkudo().click();
	   Thread.sleep(2000);
	   s1.searchoption().sendKeys("Harshini M Iyli  (harshini.iyli@qualitestgroup.com" + Keys.DOWN);
	   Thread.sleep(2000);
	   s1.searchbutton().click();
	   Thread.sleep(2000);
	   Assert.assertEquals(s1.postsearch().getText(), "Harshini Iyli");
	   
   }
   @AfterTest
	public void teardown()
	{
		driver.close();
	}
   
}


