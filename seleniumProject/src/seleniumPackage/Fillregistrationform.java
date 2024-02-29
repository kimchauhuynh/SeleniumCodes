package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fillregistrationform {

	public static void main(String[] args) {
		// TODO Auto-// 1. setup the property of chromedriver to open google page through chrome web browser.
		  //System.setProperty("webdriver.chrome.driver", "/Applications/_myWork/selenium/chromedriver_mac64/chromedriver");
		// 2. Initialize Webdriver object through ChromeDriver class.
	       WebDriver chromeBrowserObject = new ChromeDriver();
	       //WebDriver firefoxBrowserObject = new FirefoxDriver();
		// 3. Open the http://www.google.com/ link using get method.
	       chromeBrowserObject.get("http://training.qaonlinetraining.com/testPage.php");
	       chromeBrowserObject.findElement(By.name("name")).sendKeys("Mary");
	       chromeBrowserObject.findElement(By.name("email")).sendKeys("maryemail@yahoo.com");
	      chromeBrowserObject.findElement(By.name("website")).sendKeys("walmart.com");
	      //chromeBrowserObject.findElement(By.name("submit")).click();
	      
	}

}
