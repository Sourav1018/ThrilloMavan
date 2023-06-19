package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofGetAttributeMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		//getAttribute()->find the value of the particular attribute.
		String usernameAttribute = driver.findElement(By.id("username")).getAttribute("type");
		System.out.println(usernameAttribute);
		driver.quit();
	}
}
