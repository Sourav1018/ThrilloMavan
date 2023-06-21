package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsEnableMethodSSC {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ssc.nic.in/");
		boolean btnSubmit = driver.findElement(By.id("btnSubmit")).isEnabled();
		System.out.println("SSC Login Button is Enabled : "+btnSubmit);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.trainman.in/");
		WebElement searchButton = driver.findElement(By.id("homePagefrom-to-station-search-btn-webd"));
		boolean trainManSearchButton = searchButton.isEnabled();
		System.out.println("Train man Search Button is Enable : "+trainManSearchButton);
		driver.quit();
	}
}
