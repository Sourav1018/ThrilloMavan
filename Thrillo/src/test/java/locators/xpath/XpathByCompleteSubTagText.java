package locators.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByCompleteSubTagText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//by using . function we are finding sub-tag text
		driver.findElement(By.xpath("//a[.='Create a Page']")).click();
		driver.quit();
	}
}
