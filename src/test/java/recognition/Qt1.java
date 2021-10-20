package recognition;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.Verifylogin;
import resources.Base;

public class Qt1 extends Base{
	
	@Test
	public void invalidlogin() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		
		Verifylogin vl=new Verifylogin (driver);
	    vl.uname().sendKeys("suhmith.v@qualitestgroup.com");
	    vl.pwd().sendKeys("P@ssw0rd");
	    vl.login().click();
	    vl.invalid();
	}
	
	@Test
	public void login() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		
		Verifylogin vl=new Verifylogin (driver);
		
	    vl.uname().sendKeys("sushmitha.v@qualitestgroup.com");
	    vl.pwd().sendKeys("P@ssw0rd");
	    vl.login().click();
	    vl.title();
	    
	    
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	
	   
	

}

