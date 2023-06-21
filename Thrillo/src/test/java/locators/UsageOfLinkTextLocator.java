package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfLinkTextLocator {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//A Link Text in Selenium is used to identify the hyperlinks on a web page. 
		//It is determined with the help of an anchor tag. 
		//linkText() -> will trigger the <a>text</a>. here we pass the full text whatever written inside anchor tag.
		WebElement createPage = driver.findElement(By.linkText("Create a Page"));
		createPage.click();
		driver.quit();
	}
}
