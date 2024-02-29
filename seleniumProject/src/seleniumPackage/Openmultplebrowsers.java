package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Openmultplebrowsers {

	public static void main(String[] args) {
		// TODO // 1. setup the property of chromedriver to open google page through chrome web browser.
		  //System.setProperty("webdriver.chrome.driver", "/Applications/_myWork/selenium/chromedriver_mac64/chromedriver");
		// 2. Initialize Webdriver object through ChromeDriver class.
	       //WebDriver chromeBrowserObject = new ChromeDriver();
	       //WebDriver firefoxBrowserObject = new FirefoxDriver();
		// 3. Open the http://www.google.com/ link using get method.
	       //chromeBrowserObject.get("http://www.google.com/");
	        //firefoxBrowserObject.get("https://www.amazon.com/");-generated method stub
	    // 1. setup the property of chromedriver to open google page through chrome web browser.
			  //System.setProperty("webdriver.chrome.driver", "/Applications/_myWork/selenium/chromedriver_mac64/chromedriver");
			// 2. Initialize Webdriver object through ChromeDriver class.
		      WebDriver firefox = new FirefoxDriver();
		       //WebDriver firefoxBrowserObject = new FirefoxDriver();
			// 3. Open the http://www.google.com/ link using get method.
		       firefox.get("http://amazon.com");
		        //firefoxBrowserObject.get("https://www.amazon.com/");
		    // 2. Initialize Webdriver object through ChromeDriver class.
		       //WebDriver Safari = new SafariDriver();
		       //WebDriver firefoxBrowserObject = new FirefoxDriver();
			// 3. Open the http://www.google.com/ link using get method.
		       //Safari.get("https://walmart.com");
		        //firefoxBrowserObject.get("https://www.amazon.com/");
		       
	}

}
