package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpencloseMultiple {

	public static void main(String[] args) {
		// 1. setup the property of chromedriver to open google page through chrome web browser.
		  //System.setProperty("webdriver.chrome.driver", "/Applications/_myWork/selenium/chromedriver_mac64/chromedriver");
		// 2. Initialize Webdriver object through ChromeDriver class.
	       WebDriver chromeBrowserObject = new ChromeDriver();
	       //WebDriver firefoxBrowserObject = new FirefoxDriver();
		// 3. Open the http://www.google.com/ link using get method.
	       chromeBrowserObject.get("http://www.google.com/");
	        chromeBrowserObject.get("https://www.amazon.com/");
			chromeBrowserObject.close();
			
	}

}
