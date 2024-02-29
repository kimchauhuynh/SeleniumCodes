package seleniumPackage;

	//public static void main(String[] args) {
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;

		public class AmazonSignUp {
		    public static void main(String[] args) {
		        // Set the path to the ChromeDriver executable
		     //   System.setProperty("webdriver.chrome.driver","/Applications/_myWork/selenium/chromedriver_mac64/chromedriver");

		        // Initialize the ChromeDriver
		        WebDriver driver = new FirefoxDriver();

		        // Open training site sign-up page
		        driver.get("http://training.qaonlinetraining.com/testPage.php");
		        //fill in field info
		        driver.findElement(By.name("name")).sendKeys("Mary");
		        driver.findElement(By.name("email")).sendKeys("Maryemail");
		        driver.findElement(By.name("website")).sendKeys("Mary.com");
		        driver.findElement(By.name("gender")).sendKeys("Female checked");
		        driver.findElement(By.name("comment")).sendKeys("please contact me at");
		        driver.findElement(By.name("car checked"));
		        driver.findElement(By.name("submit")).click();
		        driver.close();

		      




		        	
	}

}
