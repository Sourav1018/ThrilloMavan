package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCssValueMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		//getCssValue() -> returns String. it will fetch the particular css value from the webpage.
		String borderTopCssValue = driver.findElement(By.id("loginButton")).getCssValue("border-top");
		System.out.println(borderTopCssValue);
		driver.quit();
	}
}
