package typeoutSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.Driver", "/Applications/_myWork/selenium/chromedriver_mac64/chromedriver");
		ChromeDriver Bubbie =new ChromeDriver();
		Bubbie.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement BubbieRef=Bubbie.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));//find this Element & store it in BubbieRef
		Actions act=new Actions(Bubbie);//create new Actions object, act, for Bubbie
		act.contextClick(BubbieRef).build().perform();//then tell act to right-click BubbieRef(element found)
		Thread.sleep(3000);
		Bubbie.close();
		
		
	}

}
