package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTagNameMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		//getTagName() method returns String. its returns the tag name of that particular WebElement.
		String keepMeLogin = driver.findElement(By.id("keepLoggedInCheckBox")).getTagName();
		System.out.println(keepMeLogin);
		driver.quit();
	}
}
