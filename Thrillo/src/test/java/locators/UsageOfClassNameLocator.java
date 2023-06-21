package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfClassNameLocator {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		//find element by using class name attribute
		WebElement loginButton =
				driver.findElement(By.className("initial"));
		loginButton.click();
		Thread.sleep(2000);
		driver.quit();		
	}
}
