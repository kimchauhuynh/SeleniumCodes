package typeoutSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckSocialMediaButtonsforOneWebsite {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("Webdriver.Chrome.Driver", "/Applications/_myWork/selenium/chromedriver_mac64/chromedriver");	
	ChromeDriver Bubbie=new ChromeDriver();
	Bubbie.get ("https://www.itlearn360.com/");
	Bubbie.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/ul/a[1]/li/i")).click();
	Bubbie.navigate().back();
	Bubbie.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/ul/a[2]/li/i")).click();
	Bubbie.navigate().back();
	//Thread.sleep(300);
	Bubbie.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/ul/a[3]/li/i")).click();
	Bubbie.navigate().back();
	Bubbie.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/ul/a[4]/li/i")).click();
	Bubbie.navigate().back();
	Bubbie.close();
	

	}

}
