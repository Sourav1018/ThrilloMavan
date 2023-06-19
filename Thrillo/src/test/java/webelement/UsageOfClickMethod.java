package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfClickMethod {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
	}
}
/*
 * note :
 * findElement method returns WebElement.it takes the parameter as By class.
 * By is a selenium abstract class. which have 8 static method.which take String as argument. 
 * By class help us to locate WebElement.
 * to perform the action on any WebElement we have to use WebElement methods which have 15 methods inside it.
 */