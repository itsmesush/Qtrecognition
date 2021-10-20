package recognition;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Activitypage;
import pageObjects.Verifylogin;
import resources.Base;

public class Qt2 extends Base{
	@BeforeTest
	public void login() throws IOException
	{
			driver=initializeDriver();
			driver.get(prop.getProperty("url"));
			
			Verifylogin vl=new Verifylogin (driver);
		    vl.uname().sendKeys("sushmitha.v@qualitestgroup.com");
		    vl.pwd().sendKeys("P@ssw0rd");
		    vl.login().click();
	   
	}
	 
		@Test
		public void name() 
		{
			 Activitypage ap=new  Activitypage (driver);	 
			 System.out.println(ap.name());
			 System.out.println(ap.photo());
			
	    }
		@Test
		public void title() 
		{
			
			 Activitypage ap=new  Activitypage (driver);
			ap.title();
		}
		@AfterTest
		public void teardown()
		{
			driver.close();
		}
}
	    


