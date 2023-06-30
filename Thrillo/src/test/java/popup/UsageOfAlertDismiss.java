package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfAlertDismiss {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.switchTo().alert().dismiss();
		String alertCancleButton = driver.findElement(By.id("demo")).getText();
		System.out.println(alertCancleButton);
		driver.quit(); 
	}
}
