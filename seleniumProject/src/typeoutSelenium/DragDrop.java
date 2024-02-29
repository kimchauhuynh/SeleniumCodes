package typeoutSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.Driver", "/Applications/_myWork/selenium/chromedriver_mac64/chromedriver");
	ChromeDriver Bubbie=new ChromeDriver();
	Bubbie.get("http://jqueryui.com/droppable/");
	Bubbie.switchTo().frame(0);
	WebElement draggable=Bubbie.findElement(By.xpath("//div[@id='draggable']")); //find this Element and store it in draggable
	WebElement droppable=Bubbie.findElement(By.xpath("//div[@id='droppable']"));//find this Element and store it in droppable
	Actions act= new Actions(Bubbie);//create new Actions object, act, for Bubbie
	act.dragAndDrop(draggable, droppable).build().perform();//then tell act to drag the draggable to drop on the droppable
	Thread.sleep(3000);
	Bubbie.close();

	}

}
