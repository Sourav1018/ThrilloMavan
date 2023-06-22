package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SynchronizationImplicitWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		//implicit wait -> it will wait for each and every webelement for a specific time define by programmer.
		//if its failed to load the webelement it will throws NoSuchElementException
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//find elements 
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		//this gives no such element exception because id=sourav there is no type of id available.
		//but before it gives the exception it will wait for that webelement for the given duration of time.
		//driver.findElement(By.xpath("//td[text()='Enter Time-Track']"));
		//driver.findElement(By.id("sourav"));	
		//clicking logout
		driver.findElement(By.cssSelector("a[class='logout']")).click();
		driver.quit();
	}
}
