package typeoutSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillRegistrationPopulateInput {

	public static void main(String[] args) {
//1. set up system to go to my computer location to get Chrome Driver
		System.setProperty("WebDriver.Chrome.Driver", "/Applications/_myWork/selenium/chromedriver_mac64/chromedriver");
	//2. create a new java object and name it Maurice, give it type ChromeDriver
		ChromeDriver Maurice=new ChromeDriver();
	//3. Command Maurice to open a website address
		Maurice.get("http://training.qaonlinetraining.com/testPage.php");
		Maurice.findElement(By.name("name")).sendKeys("Mary");
		Maurice.findElement(By.name("email")).sendKeys("MaryH@yahoo.com");
		Maurice.findElement(By.name("website")).sendKeys("amazon.com");
		Maurice.findElement(By.name("comment")).sendKeys("This is OK");
		Maurice.close();
	}

}
