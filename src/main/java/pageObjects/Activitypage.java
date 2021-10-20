package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import resources.Base;

public class Activitypage extends Base {
	
public WebDriver driver;
	
	By name = By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h5[1]");
	By photo = By.xpath("//div[@class='container']/div[1]/div[1]/div/div[1]/img");
	
	public Activitypage(WebDriver driver)
	{
		this.driver=driver;
	}
	public boolean name()
	{
		return driver.findElement(name).isDisplayed();
	}
	public boolean photo()
	{
		return driver.findElement(photo).isDisplayed();
	}
	public  void title()
	{
	String actualTitle=	driver.getTitle();
	String expectedTitle="QTRecognition";
	
	Assert.assertEquals(expectedTitle,actualTitle);
	
	
	}
}
