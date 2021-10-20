package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class Verifylogin extends Base {
	
	
		public WebDriver driver;
		By uname=By.xpath("//body/div[2]/form[1]/input[1]");
		By pwd=By.xpath("//body/div[2]/form[1]/input[2]");
		By login=By.xpath("//button[contains(text(),'Login')]");
		
		// User should be allowed login using UserName and password

		public Verifylogin(WebDriver driver)
		{
			this.driver=driver;
		}

		public WebElement uname()
		{
			return driver.findElement(uname);
			
		}
		
		public WebElement pwd()
		{
			return driver.findElement(pwd);
		}
		public WebElement login()
		{
			return driver.findElement(login);
		}
		//Application title should be displayed as “QTRecognition”
		public  void title()
		{
			System.out.println(driver.getTitle());
		}
		public void invalid()
		{
			 System.out.println(driver.switchTo().alert().getText());
			 driver.switchTo().alert().accept();
			 driver.navigate().back();
		}
		
}
