package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	 public WebDriver driver;
	 public Properties prop;
		public WebDriver initializeDriver() throws IOException{
			 prop=new Properties();
	        FileInputStream fis=new FileInputStream("C:\\Users\\Sushmitha\\eclipse-workspace\\Qtrecognition\\src\\main\\java\\resources\\data.properties");
	        prop.load(fis);
	     String browserName   =   prop.getProperty("browser");
	        if(browserName.equals("chrome")) {
	        	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	        	driver = new ChromeDriver();
	        	
	        }
	        return driver;
		}

}
