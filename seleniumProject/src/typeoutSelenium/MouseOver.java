package typeoutSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.Driver",("/Applications/_myWork/selenium/chromedriver_mac64/chromedriver"));
		ChromeDriver Bubbie=new ChromeDriver();
		Bubbie.get("https://www.stmarymagdalen.org/");
		WebElement BubbieRef=Bubbie.findElement(By.xpath("/html/body/form/div/div[2]/ul/li[2]/a"));//Bubbie, find this Element, and store it in BubbieRef
		Actions act = new Actions(Bubbie);
		act.moveToElement(BubbieRef).build().perform();//mouse over the Element stored in BubbieRef 
		Thread.sleep(3000);
		Bubbie.findElement(By.xpath("/html/body/form/div/div[2]/ul/li[2]/ul/li[4]/a")).click();//next, look for this Element and click on it
		Bubbie.close();
		
	}

}
