package typeoutSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCloseAmazon {

	public static void main(String[] args) {
		//1. Set up System to go to a location on my computer that has ChromeDriver
		System.setProperty("Webdriver.Chrome.Driver", "/Applications/_myWork/selenium/chromedriver_mac64/chromedriver");
		//2. Create a new Java Object of ChromeDriver and name it Bubbie, give it a type ChromeDriver
		ChromeDriver Bubbie= new ChromeDriver();
		//3. Command the object Bubbie to open google and close it and print out accomplished after done
		Bubbie.get("http://Amazon.com/");
		Bubbie.close();
		System.out.println ("accomplished!");
	}

}
