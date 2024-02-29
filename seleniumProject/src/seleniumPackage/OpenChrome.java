package seleniumPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class OpenChrome {

	public static void main(String[] args) {
		// 1. setup the property of chromedriver to open google page through chrome web browser.
		  //System.setProperty("webdriver.chrome.driver", "/Applications/_myWork/selenium/chromedriver_mac64/chromedriver");
		// 2. Initialize Webdriver object through ChromeDriver class.
	       WebDriver chromeBrowserObject = new ChromeDriver();
	       //WebDriver firefoxBrowserObject = new FirefoxDriver();
	       chromeBrowserObject.get("http://www.google.com/");
	        //firefoxBrowserObject.get("https://www.amazon.com/");
			
	}

}



/**
 * Downloaded the latest jars and saved it under /Applications/_myWork/selenium/selenium-java-4.16.1
 * put all the jars in the build path.
 * Fix for import error: Go to configure build path and then Java Compiler.  set the compiler compliance level to 1.8.
 * Fix for WebDriver error: import org.openqa.selenium.WebDriver;
 * 
 */

