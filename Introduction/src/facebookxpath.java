import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.getProperty("webdriver.chorome.driver", 
				"Documents/Udemy/Selenium-WebDriver-with-Java-Basic-to-advance/browser-exe-files/chrome/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		WebElement userNameElement = driver.findElement(By.xpath("//input[@type='email']"));
		userNameElement.sendKeys("myUsername");
		
		WebElement passWordElement = driver.findElement(By.xpath("//input[@data-testid=\"royal_pass\"]"));
		passWordElement.sendKeys("ThisIsMyPass");
		
		WebElement logInElesment = driver.findElement(By.xpath("//input[@data-testid=\"royal_login_button\"]"));
		logInElesment.click();
		

	}

}
