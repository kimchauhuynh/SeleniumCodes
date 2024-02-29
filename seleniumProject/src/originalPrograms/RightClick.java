package originalPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// 1. setup the property of chromedriver because we will perform testing of Mouse Over operation through chrome web browser.
			//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
				// 2. Initialize WebDriver object through ChromeDriver class.
				ChromeDriver browserObject = new ChromeDriver();
				// 3. Open the web page http://swisnl.github.io/jQuery-contextMenu/demo.html
				browserObject.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		        
		        // 4. In case of RightClick we use Actions class.Create object and pass the driver to the reference
		       Actions action = new Actions(browserObject);    //to use right click, we need Actions class, so we create a new object action of Actions but still in relation to browserObject object
			
		       // 5. Locate the button using xpath and store the value in the reference that is rightClickElement
		      WebElement boxtoClick = browserObject.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		      
		      // 6. Using the action reference call the contextclick method and pass  element to perform right click
		      action.contextClick(boxtoClick).build().perform();//browserObject-->action-->boxtoClick, use contextClick method to click boxtoClick following build and perform path
	}

}