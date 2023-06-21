package locators.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByPartialAttribute {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//by partial attribute value and by using contains().
		WebElement loginButton = 
		driver.findElement(By.xpath("//button[contains(@class,'_42ft _4jy0 _6lth _4jy6')]"));
		loginButton.click();
		Thread.sleep(3000);
		driver.quit();
	}
}
