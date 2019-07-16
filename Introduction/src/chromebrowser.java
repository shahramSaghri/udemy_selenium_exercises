import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.getProperty("webdriver.chrome.driver", "/Documents/Udemy/Selenium-WebDriver-with-Java-Basic-to-advance/browser-exe-files/chrome/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		//driver.findElement(By.id("email")).sendKeys("");
		WebElement userNameElement = driver.findElement(By.id("email"));
		userNameElement.sendKeys(" ");
		
		WebElement passWordElement = driver.findElement(By.id("pass"));
		passWordElement.sendKeys("");
		
		WebElement login = driver.findElement(By.id("loginbutton"));
		login.click();
	}

}
