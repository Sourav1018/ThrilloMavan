package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsEnableMethod {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement serchBox = driver.findElement(By.id("APjFqb"));
		serchBox.sendKeys("hello");
		serchBox.sendKeys(Keys.ENTER);
		boolean nextLink = driver.findElement(By.id("pnnext")).isEnabled();
		System.out.println("check the next Link<a> is Enabled : "+nextLink);
		driver.findElement(By.id("pnnext")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
