package typeoutSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.Driver"," /Applications/_myWork/selenium/chromedriver_mac64/chromedriver");
		ChromeDriver Bubbie= new ChromeDriver();
		Bubbie.get("http://training.qaonlinetraining.com/testPage.php");
		Bubbie.findElement(By.xpath("//input[@value='female']")).click();//find Female button Element and click
		Thread.sleep(3000);
		Bubbie.findElement(By.xpath("//input[@value='Send']")).click();//find submit button element and click
		Thread.sleep(3000);
		Bubbie.close();
	}

}
