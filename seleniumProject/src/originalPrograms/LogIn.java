package originalPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {

	public static void main(String[] args) {
		//Declare webdriver interface reference
		WebDriver browserObject; //imported webdriver.  It seems after this statement, there's no need to give Type ChromeDriver to new Ojbect
		// 1. setup the property of chromedriver because we will perform testing of login process through chrome web browser.
	     //   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 2. Initialize Webdriver object through ChromeDriver class.
	        browserObject = new ChromeDriver();//import ChromeDriver
		// 3. Open login page of https://admin-demo.nopcommerce.com/login
	        browserObject.get("https://admin-demo.nopcommerce.com/login");
	       
		// 4. Get reference of Email input box by locate the id method.
	        WebElement email=browserObject.findElement(By.id("Email"));   //import By and import WebElement
		// 5. Clear the Email input box.
	        email.clear();
		// 6. Get reference of Password input box by locate the id method.
	        WebElement password=browserObject.findElement(By.id("Password"));
		// 7. Clear the Password input box.
	        password.clear();
		// 8. Provide/Enter the correct email to email input box through reference.
	        email.sendKeys("admin@yourstore.com");
		// 9. Provide/Enter the correct password to password input box through reference.
	        password.sendKeys("admin");
		// 10. Get reference of login button by locate the classname method.
	        WebElement button=browserObject.findElement(By.className("button-1"));
		// 11. Submit the button.
	        button.submit();
		// 12. Close the web browser.
		browserObject.close();
	}

}