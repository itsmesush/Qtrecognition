package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class Others extends Base{
	public WebDriver driver;
	By fromme = By.xpath("//span[contains(text(),'Kudos from me')]");
	By receivedkudos = By.xpath("//span[contains(text(),'Kudos to me')]");
	By kudocnt1 = By.xpath("//h5[@id='todayCount']");
	By sendkudobutton=By.xpath("//body/nav[1]/div[1]/div[1]/div[2]/a[1]");
	By nameoremail=By.xpath("//input[@id='email_address']");
	By kudo1=By.xpath("//body/div[@id='myModal']/div[1]/div[1]/form[1]/div[2]/div[3]/div[1]/div[1]/div[1]");
	By comments=By.xpath("//textarea[@id='comment']");
	By sendbutton=By.xpath("//button[contains(text(),'Send')]");
	By kudocnt2=By.xpath("//h5[@id='todayCount']");
	By activity=By.xpath("//span[contains(text(),'Activity')]");
	By cancelbutton=By.xpath("//button[contains(text(),'Cancel')]");
	public Others(WebDriver driver) 
	{
		this.driver=driver;
	}

	public WebElement  fromme()
	{
		return driver.findElement(fromme);
	}
	
	public WebElement receivedKudos()
	{
		return driver.findElement(receivedkudos );
	}
	
	public WebElement activity()
	{
		return driver.findElement(activity);
	}
	public String Kudocnt1()
	{
		return driver.findElement(kudocnt1).getText();
	}
	
	public WebElement sendk()
	{
		return driver.findElement(sendkudobutton);
	}
	
	public WebElement enteremail()
	{
		return driver.findElement(nameoremail);
	}
	
	public WebElement click1()
	{
		return driver.findElement(kudo1);
	}
	
	public WebElement comm()
	{
		return driver.findElement(comments);
	}
	public WebElement snd()
	{
		return driver.findElement(sendbutton);
	}
	public String Kudocnt2()
	{
		return driver.findElement(kudocnt2).getText();
	}
	
	public WebElement cancl()
	{
		return driver.findElement(cancelbutton);
	}
}


