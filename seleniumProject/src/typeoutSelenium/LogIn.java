package typeoutSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("WebDriver.Chrome.Driver", "/Applications/_myWork/selenium/chromedriver_mac64/chromedriver");
ChromeDriver Bubbie=new ChromeDriver();
Bubbie.get("https://admin-demo.nopcommerce.com/login");

Bubbie.findElement(By.id("Email")).clear();
Bubbie.findElement(By.id("Email")).sendKeys("mary@yam.com");

Bubbie.findElement(By.id("Password")).clear();
Bubbie.findElement(By.id("Password")).sendKeys("money");

Bubbie.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();

Thread.sleep(3000);
Bubbie.close();

	}

}
