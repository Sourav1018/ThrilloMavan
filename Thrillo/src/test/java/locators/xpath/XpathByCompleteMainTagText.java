package locators.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByCompleteMainTagText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//by using text() function -> we can find the main tag text .
		WebElement createpage =
		driver.findElement(By.xpath("//a[text()='Create a Page']"));
		
		createpage.click();
		driver.quit();
	}
}
