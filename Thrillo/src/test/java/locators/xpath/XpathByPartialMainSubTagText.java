package locators.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByPartialMainSubTagText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//its used to find partial sub/main tag text by contains and . function
		driver.findElement(By.xpath("//a[contains(.,'Wa')]")).click();
		driver.quit();
	}
}
