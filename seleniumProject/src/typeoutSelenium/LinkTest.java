package typeoutSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.Driver", "/Applications/_myWork/selenium/chromedriver_mac64/chromedriver");
        ChromeDriver Bubbie = new ChromeDriver();       
        Bubbie.get("https://www.google.com/");
	// 4. The value of text link is stored in bloglink reference . Here TextLink is a locator that checks wether a text is link or not.		  
        Bubbie.findElement(By.linkText("Gmail"));
       // System.out.println("Gmail link is diplayed usingLinkText");
//Thread.sleep(300);
//Bubbie.close();

	}

}
