package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Kudosearch {
	public WebDriver driver;
	By searchlink=By.xpath("//span[contains(text(),'Kudos Search')]");
	By srchoptn=By.xpath("//input[@id='s_e_add']");
	By srchbtn=By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]");
	By aftersearch=By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/h5[1]/b[2]");
	
	public Kudosearch(WebDriver driver) 
	{
		this.driver=driver;
	}
	public WebElement  searchkudo()
	{
		return driver.findElement(searchlink);
	}
	public WebElement searchoption() 
	{
		return driver.findElement(srchoptn);
	}
	public WebElement searchbutton() 
	{
		return driver.findElement(srchbtn);
	}
	public WebElement postsearch()
	{
		return driver.findElement(aftersearch);
	}
	
}


