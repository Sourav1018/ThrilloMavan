package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsDisplayMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		//isDisplay() -> returns boolean. verifies if a certain element is present and displayed. 
		boolean usernameDisplay = driver.findElement(By.id("username")).isDisplayed();
		System.out.println("user name text field is displayed : "+usernameDisplay);
		driver.quit();
	}
}
