package typeoutSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("WebDriver.Chrome.Driver", "/Applications/_myWork/selenium/chromedriver_mac64/chromedriver");
ChromeDriver Bubbie=new ChromeDriver();
Bubbie.get("https://stackoverflow.com/");//open this website
Thread.sleep(250); //hold on a bit
Bubbie.findElement(By.xpath("/html/body/header/div/nav/ol/li[4]/a")).click();  //find Signin button by xpath Element and click
Bubbie.findElement(By.name("email")).sendKeys("mary@yahoo.com"); //find email and pw box and populate them
Bubbie.findElement(By.name("password")).sendKeys("wwwna");
Thread.sleep(500); //(hold on a bit
Bubbie.findElement(By.name("submit-button")).click();  //find submit button and click , then hold on a bit, then close
Thread.sleep(3000);
Bubbie.close();



	}

}
