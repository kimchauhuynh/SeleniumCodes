package originalPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		// 1. setup the property of chromedriver because we will perform testing of drag and drop operation through chrome web browser.
	//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 2. Initialize WebDriver object through ChromeDriver class.
		ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the web page http://jqueryui.com/droppable/	
		browserObject.get("http://jqueryui.com/droppable/");
	        // 4. In this case we switch the focus to frame 
	        browserObject.switchTo().frame(0);//switch to the frame of the page using switchTo().frame(0) method
	        // 5. Get the reference of source element using xpath.
	        WebElement source = browserObject.findElement(By.xpath("//div[@id='draggable']"));//find Element by xpath and referencing it to source, WebElement class
		// 6. Get the reference of target element using xpath.
	        WebElement target = browserObject.findElement(By.xpath("//div[@id='droppable']"));//same above
	       
		// 7. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
	        Thread.sleep(3000);

		// 8. In case of drop we use Actions class.Create refernce and pass the driver to the reference
	        Actions act = new Actions(browserObject);//create new act object of Actions class, this act object is acting on behalf of browserObject object
	        
	        // 9. Using the action reference call the dragAndDrop method and pass the source and target element
	        act.dragAndDrop(source, target).build().perform();//tell act to command DragandDrop with the source and target built above, then perform 
	        //build() :Generates a composite action containing all actions so far, ready to be performed
	        //Perform is used to execute the actions that were built using the build method. 
	        Thread.sleep(3000);
		// 10. Close the browser
	        browserObject.close();
	}

}
