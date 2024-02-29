package typeoutSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.Driver", "/Applications/_myWork/selenium/chromedriver_mac64/chromedriver");
		ChromeDriver Bubbie= new ChromeDriver();//create a new java object of ChromeDriver, name it Bubbie
		Bubbie.get("http://training.qaonlinetraining.com/testPage.php");//open this web site
		Bubbie.findElement(By.xpath("//input[@value='boat']")).click();//find element of boat button and click
		Bubbie.findElement(By.xpath("//input[@value='Bike']")).click();//find element of bike button and click
		Bubbie.findElement(By.xpath("//input[@value='car']")).click();//find element of car button and click
		Bubbie.findElement(By.xpath("//input[@value='horse']")).click();//find element of horse box and click
		Thread.sleep(3000);
		Bubbie.findElement(By.xpath("//input[@value='Send']")).click();//find element of submit button and click
		Thread.sleep(3000);
		Bubbie.close();
	}

}
