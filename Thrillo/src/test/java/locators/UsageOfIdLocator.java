package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIdLocator {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		//using id Selector find the element by id attribute
		WebElement usernameEle = driver.findElement(By.id("username"));
		usernameEle.sendKeys("admin");
		driver.quit();
	}
}
