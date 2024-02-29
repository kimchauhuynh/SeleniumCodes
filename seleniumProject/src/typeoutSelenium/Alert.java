package typeoutSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("WebDriver.Chrome.Driver","/Applications/_myWork/selenium/chromedriver_mac64/chromedriver");
ChromeDriver Bubbie= new ChromeDriver();
Bubbie.get("http://training.qaonlinetraining.com/testPage.php");
Bubbie.findElement(By.id("alert")).click();
	org.openqa.selenium.Alert alert= Bubbie.switchTo().alert();
	Thread.sleep(3000);
	alert.accept();
	
Bubbie.findElement(By.id("confirm")).click();
org.openqa.selenium.Alert alert1= Bubbie.switchTo().alert();
Thread.sleep(3000);
alert1.dismiss();

Bubbie.findElement(By.id("prompt")).click();
org.openqa.selenium.Alert alert2= Bubbie.switchTo().alert();
alert2.sendKeys("Miss Mary");
//System.out.println(Bubbie.findElement(By.id("demo")));
Thread.sleep(3000);
alert2.accept();

Thread.sleep(3000);
Bubbie.close();


	
		
	}

}
