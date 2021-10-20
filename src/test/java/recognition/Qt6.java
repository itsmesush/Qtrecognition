package recognition;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Others;
import pageObjects.Verifylogin;
import resources.Base;

public class Qt6 extends Base {
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
	public void fromme() throws InterruptedException
	{   
		// kudos sent from my side
		 Others o=new  Others(driver);
		 Thread.sleep(400);
		 o. fromme().click();
		 Assert.assertTrue(o.fromme().isDisplayed());
	
        
		
	}
	
    @Test
    public void kudostome() throws InterruptedException
    {
    	// kudos received by me
    	 Others t=new  Others(driver);
    	 Thread.sleep(4000);
    	 t.receivedKudos().click();
    	 
    	 Assert.assertTrue(t.receivedKudos().isDisplayed());
    }
    @AfterTest
	public void teardown()
	{
		driver.close();
	}
}
