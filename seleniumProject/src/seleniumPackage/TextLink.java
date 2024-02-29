package seleniumPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TextLink {

	public static void main(String[] args) {
		 WebDriver browserObject = new ChromeDriver();
        // 3. Open the web page https://www.google.com/
        browserObject.get("https://www.google.com/");
	// 4. The value of text link is stored in bloglink reference . Here TextLink is a locator that checks wether a text is link or not.		  
       browserObject.findElement(By.linkText("Gmail"));
			  
			 
	// 5. If the text is form of link then its displayed or else will not display
      // if (blogLink.isDisplayed()) {
          System.out.println("Gmail link is diplayed usingLinkText");
     // } else {
     //    System.out.println("Unable to find Gmail");
    //    }
//	6. Close the browser
      //  browserObject.close();
	}

}
