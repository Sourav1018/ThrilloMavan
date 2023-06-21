package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfPartialLinkTextLocator {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//A Link Text in Selenium is used to identify the hyperlinks on a web page. 
		//It is determined with the help of an anchor tag. 
		//partialLinkText() -> will trigger the <a>text</a>. here we pass the partial text whatever written inside anchor tag.
		WebElement downLogin = 
				driver.findElement(By.partialLinkText("in"));
		downLogin.click();
		Thread.sleep(3000);
		driver.quit();
	}
}
