package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfCssSelectorLocator {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//The CSS Selector combines an element selector and a selector value that can identify particular elements on a web page. 
		//Like XPath in Selenium, CSS selectors can locate web elements without ID, class, or Name.
		WebElement createPage =
				driver.findElement(By.cssSelector("a[class='_8esh']"));
		createPage.click();
		Thread.sleep(2000);
		driver.quit();
	}
}
