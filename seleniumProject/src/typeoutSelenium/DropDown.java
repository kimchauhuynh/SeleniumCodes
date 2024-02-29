package typeoutSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.Driver","/Applications/_myWork/selenium/chromedriver_mac64/chromedriver");
		ChromeDriver Bubbie= new ChromeDriver();
		Bubbie.get("http://training.qaonlinetraining.com/testPage.php");
		Select countrybox =new Select(Bubbie.findElement(By.name("country")));
		countrybox.selectByVisibleText("Ethiopia");
		Select skillbox= new Select(Bubbie.findElement(By.name("skill")));
		skillbox.selectByVisibleText("Database");
		Bubbie.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		Bubbie.quit();
	}

}
