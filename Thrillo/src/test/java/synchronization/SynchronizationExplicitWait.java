package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationExplicitWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		String eHpTitle =  "actiTIME -  Enter Time-Track";
		System.out.println("Expected title "+eHpTitle);
		String aHpTitl = "";
		//
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//find element
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		//capture the actual title title 
		Boolean boobleanTitle = wait.until(ExpectedConditions.titleIs(eHpTitle));
		if(boobleanTitle)
		{
			aHpTitl = driver.getTitle();
			System.out.println("actual Title "+aHpTitl);
		}
		else {
			System.out.println("TimeOutException");
		}
		//logout
		driver.findElement(By.cssSelector("a[class='logout']")).click();
		driver.quit();
	}
}
