package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetRect {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		WebElement el = driver.findElement(By.id("radio1"));
		//getRect() -> returns rectangle. Rectangle is a selenium class.
		//its replacement of getLocation() and getSize() method.
		//its help us to find x,y coordinate of an element and also height,width of an element.
		//Rectangle class toString() is not overridden, if we pass reference then it will return class address.
		Rectangle e = el.getRect();
		System.out.println(e);
		System.out.println("get X axies : " + e.x + ".." + e.getX());
		System.out.println("get Y axies : " + e.y + ".." + e.getY());
		System.out.println("get height : " + e.height + ".." + e.getHeight());
		System.out.println("get width : " + e.width + ".." + e.getWidth());
		driver.quit();
	}
}
