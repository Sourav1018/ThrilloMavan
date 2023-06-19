package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTextMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		//find any kind of text present on the website using getText() -> returns String.
		String actitimeText = driver.findElement(By.id("headerContainer")).getText();
		System.out.println(actitimeText);
		driver.quit();
	}
}
