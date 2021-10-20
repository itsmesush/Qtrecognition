package recognition;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Sendkudos;
import pageObjects.Verifylogin;
import resources.Base;

public class Qt3 extends Base {
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
public void type1()
{
	Sendkudos k= new Sendkudos (driver);
	//user should be able to send kudos from actvity page
	k.sendk().click();
	k.enteremail().sendKeys("Harshini M Iyli  (harshini.iyli@qualitestgroup.com)" + Keys.DOWN);
	k.click1().click();
	k.comm().sendKeys("great work!" );
	k.snd().click();
	k.cancl().click();	
	
	
}
@AfterTest
public void close()
{
	Sendkudos k= new Sendkudos (driver);
	k.close();
	driver.close();
}

	



/*public void type2()
{
	Sendkudos n= new Sendkudos(driver);
	n.resendbtn().click();
	n.click1().click();
	n.comm().sendKeys("tests");
	n.snd().click();
}*/



}
