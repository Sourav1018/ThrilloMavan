package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfTagNameLocator {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		//find the element by Tag name Attribute only use the tag name no need to use <>
		 WebElement loginbutton =
				 driver.findElement(By.tagName("a"));
		 loginbutton.click();		 
		Thread.sleep(2000);
		driver.quit();
	}
}
