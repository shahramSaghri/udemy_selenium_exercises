import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//chromedriver.exe
		System.getProperty("webdriver.chrome.driver", 
				"Documents/Udemy/Selenium-WebDriver-with-Java-Basic-to-advance/browser-exe-files/chrome/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://login.salesforce.com");
		
		WebElement userNameElement = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		userNameElement.sendKeys("How are you");

	}

}
