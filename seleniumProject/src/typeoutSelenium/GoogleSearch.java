package typeoutSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.Driver", "/Applications/_myWork/selenium/chromedriver_mac64/chromedriver");
		ChromeDriver Bubbie =new ChromeDriver ();
		Bubbie.get("http://google.com");
		Bubbie.findElement(By.name("q")).sendKeys("Selenium Documents");
		Bubbie.findElement(By.name("btnK")).click();//or write .submit(); it will have the same effect of sending search key
		Thread.sleep (1000);//sleep for 1000 milisecond
		//Bubbie.close();
	}

}
