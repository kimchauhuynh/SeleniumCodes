package seleniumPackage;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Jan27selenium {

	public static void main(String[] args) {
		// 1. setup the property of chromedriver to open amazon page through chrome web browser.
				//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" ); Windows
				System.setProperty("webdriver.chrome.driver", "/Applications/_myWork/selenium/chromedriver_mac64/chromedriver" ); //MacOS
				// 2. Initialize Webdriver object through ChromeDriver class. 
			        //WebDriver browserChromeObject = new ChromeDriver();
			        //WebDriver littlebubbie = new FirefoxDriver();
        WebDriver littlebubbie = new FirefoxDriver();
				// 3. Open the http://www.amazon.com/ link using get method.
			        //browserObject.get("http://www.amazon.com/");
        //littlebubbie.get("https://firefox.com");
        littlebubbie.get("https://walmart.com");
        
        //WebDriver littlebubbie = new FirefoxDriver();
        WebDriver test = new FirefoxDriver();
				// 3. Open the http://www.amazon.com/ link using get method.
			 
        test.get("https://amazon.com");
        //WebDriver littlebubbie = new FirefoxDriver();
        WebDriver test1 = new FirefoxDriver();

				// 3. Open the http://www.amazon.com/ link using get method.
			 
        test1.get("https://ebay.com");
     
        littlebubbie.close();

        test.close();

        test1.close();


				//browserObject.close();
	}

}
