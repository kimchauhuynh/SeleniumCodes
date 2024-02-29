package typeoutSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateWebsites {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.Driver","/Applications/_myWork/selenium/chromedriver_mac64/chromedriver");
		ChromeDriver Bubbie=new ChromeDriver();
		Bubbie.get("https://github.com");
		System.out.println("This is " + Bubbie.getTitle()+ "website");
		Thread.sleep(300);
		Bubbie.get("https://docs.google.com/presentation/d/19s6Y7fpKwOrToEfolHfgimitr2aqG61jpIispQ5pbt8/edit#slide=id.g2b6506dd8eb_0_0");
		System.out.println("This is " + Bubbie.getTitle() + "website");
		Thread.sleep(300);
		Bubbie.get("https://www.youtube.com/watch?v=Wx6cA8VZneI");
		System.out.println("This is " + Bubbie.getTitle()+ "website");
		Bubbie.navigate().to("http://www.instagram.com/");
		System.out.println("URL is " + Bubbie.getCurrentUrl());
		Thread.sleep(300);
		Bubbie.get("https://www.facebook.com/");
		System.out.println("This is "+ Bubbie.getTitle());
		System.out.println("The current website URL is " + Bubbie.getCurrentUrl()+ "DONE");
		Bubbie.close();
		
		// navigate ().to ("") is the same as .get("");
		//get(url) : It does not maintain the browser history and cookies and wait till page fully loaded. driver.navigate.to(url) :It is also used to go to particular web page.it maintain browser history and cookies and does not wait till page fully loaded and have navigation between the pages back, forward and refresh
	}

}
