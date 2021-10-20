package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class Sendkudos extends Base{
public WebDriver driver;
	
	
	public Sendkudos(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By sendkudobutton=By.xpath("//body/nav[1]/div[1]/div[1]/div[2]/a[1]");
	By nameoremail=By.xpath("//input[@id='email_address']");
	By kudo1=By.xpath("//body/div[@id='myModal']/div[1]/div[1]/form[1]/div[2]/div[3]/div[1]/div[1]/div[1]");
	By kudo2=By.xpath("//body/div[@id='myModal']/div[1]/div[1]/form[1]/div[2]/div[3]/div[2]/div[1]/div[1]");
	By comments=By.xpath("//textarea[@id='comment']");
	By cancelbutton=By.xpath("//button[contains(text(),'Cancel')]");
	By sendbutton=By.xpath("//button[contains(text(),'Send')]");
	By comment=By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/h5[1]/b[2]");
	By nocomment=By.xpath("//center[contains(text(),'Please enter any comment.')]");
	By rsndbtn=By.xpath("//body/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/h5[1]/small[1]/a[1]/i[1]");
	By invalidname=By.xpath("//center[contains(text(),'Please enter receiver email address.')]");
	By close=By.cssSelector("button.close");
	
	
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
	public WebElement click2()
	{
		return driver.findElement(kudo2);
	}
	public WebElement comm()
	{
		return driver.findElement(comments);
	}
	public WebElement cancl()
	{
		return driver.findElement(cancelbutton);
	}
	public WebElement snd()
	{
		return driver.findElement(sendbutton);
	}
	public WebElement commented()
	{
		return driver.findElement(comment);
	}
	public WebElement nocmt()
	{
		return driver.findElement(nocomment);
	}
	public WebElement resendbtn()
	{
		return driver.findElement(rsndbtn);
	}
	public WebElement close()
	{
		return driver.findElement(close);
	}
	
}

