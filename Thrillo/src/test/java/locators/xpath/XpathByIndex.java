package locators.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndex {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/index.html");
		//xpath by index find the element by its index value
		WebElement sensexIndex = driver.findElement(By.xpath("//div[@class='leftcontainer']/descendant::div[@id='div_bseindices']//ul[2]/li[1]/a"));
		sensexIndex.click();
		Thread.sleep(5000);
		driver.quit();
	}
}
