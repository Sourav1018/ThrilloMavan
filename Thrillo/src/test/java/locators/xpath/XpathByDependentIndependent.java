package locators.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByDependentIndependent {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=vivo&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		//dynamically changing element using the nearby unique element. We call this concept as independent dependent XPath.
		//for finding parent we need to use /..
		//from common parent to only child /
		//from common parent to navigate into child's child use //
		WebElement vivoPrice = driver.findElement(By.xpath("//div[contains(text(),'vivo T2x 5G (Glimmer Black, 128 GB)')]/..//li[text()='8 GB RAM | 128 GB ROM']/../../../..//div[@class='_30jeq3 _1_WHN1']"));
		vivoPrice.click();
		Thread.sleep(2000);
		driver.quit();
	}
}
