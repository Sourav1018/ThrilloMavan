package assignment.capture;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureLink {
	
	//web-driver reference
	WebDriver driver;
	
	//create a list for store valid Links
	List<String> allLinks = new ArrayList<>();
	
	//method for finding link
	void linkFlipKart() {
		FileInputStream fis = null;
		try {
		//load the file as object
		fis = new FileInputStream("./src/test/resources/FlipkartDemo.properties");
		}catch (Exception e) {
			System.out.println("invalid file / file not found");
		}
		//Instantiate property object
		Properties pFile = new Properties();
		
		//load file object into property object
		try {
			pFile.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//check the browser and instantiate the browser
		if(pFile.getProperty("browser").equals("chrome")) {
			driver = new ChromeDriver();
		}
		else {
			System.exit(0);
		}
		
		//trigger the URL.
		driver.get(pFile.getProperty("flipkart"));
		
		//capture the links from the flipkart
		List<WebElement> webLinksFlipkart = driver.findElements(By.tagName("a"));
		
		//print the links using for-each loop
		for(WebElement link:webLinksFlipkart) {
			String tempLink = link.getAttribute("href");
			if(checkLink(tempLink)) {
				allLinks.add(tempLink);
			}
		}
		
		//printing the link list
		printList(allLinks);
		System.out.println(allLinks.size());
		
		//save the links to a file 
		saveLinkFile(allLinks);
		
		//browser quit
		driver.quit();
	}
	
	//external method for checking link starts with https://
	boolean checkLink(String tempLink) {
		//checking String having https:// protocol 
		if(tempLink.substring(0, 8).equals("https://")) {
			return true;	
		}
		return false;
	}
	
	//External printing method for List
	<T> void printList(List<T> print) {
		for(T p:print) {
			System.out.println(p);
		}
	}
	
	//external saveLink method 
	<T> void saveLinkFile(List<T> links) {
		//create the file
		File linkFile = new File("./src/test/resources/FlipkartHomePageLinks.txt");
		//printStream to that file
		PrintStream writer = null;
		try {
		 writer = new PrintStream(linkFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		for(int i=0; i < links.size(); i++) {
			writer.println(links.get(i));
		}
		writer.close();
	}
}
