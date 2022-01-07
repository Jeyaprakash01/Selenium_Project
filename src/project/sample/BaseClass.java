package project.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;


public class BaseClass {
	public static WebDriver driver;
	public static Actions ac; 

	public static WebDriver getbrowser(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir")+("\\Driver\\chromedriver.exe"));
				driver = new ChromeDriver();
			}
			else if (browsername.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir")+("\\Driver\\chromedriver.exe"));
				driver = new EdgeDriver();
			}
			else {
				System.out.println("invalid browser");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;

	}
public static void geturl(String url) {
driver.get(url);
}
public static void sendkeys(WebElement element, String value) {
	element.sendKeys(value);
}
/*
 * public static void actions(WebElement course, String args) {
 * ac.moveToElement(course).perform(); 
 * } 
 * public static void actions1(WebElement oracle, String args) { 
 * ac.moveToElement(oracle).perform(); 
 * }
 * public static void actions2(WebElement last, String args) {
 * ac.moveToElement(last).perform(); }
 */
}
