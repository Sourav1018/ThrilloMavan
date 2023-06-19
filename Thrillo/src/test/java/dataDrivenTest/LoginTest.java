package dataDrivenTest;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	@Test
	public void loginTest() throws Throwable 
	{
		//create file object
		FileInputStream fis = new FileInputStream("./src/test/resources/ActitimeDemo.properties");
		//load the properties file
		Properties propertiesObject = new Properties();
		//load the file into properties class
		propertiesObject.load(fis);
		//fetch data using getProperty - String return type method
		String browserName = propertiesObject.getProperty("browser");
		//create the instance of the given browser 
		if(browserName.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		//pre condition
		driver.manage().window().maximize();
		//call the URL
		driver.get(propertiesObject.getProperty("url"));
		//find the Username textbox and pass the valid credential
		driver.findElement(By.id("username")).sendKeys(propertiesObject.getProperty("username"));
		//find the password textbox and pass the valid credential
		driver.findElement(By.name("pwd")).sendKeys(propertiesObject.getProperty("password"));
		//find login button and click on it
		driver.findElement(By.id("loginButton")).click();
		//wait to see full execution
		Thread.sleep(6000);
		//post condition 
		driver.quit();
		
	}
}
