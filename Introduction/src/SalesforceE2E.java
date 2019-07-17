import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SalesforceE2E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.getProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://rediff.com");
		
		WebElement signInElement = driver.findElement(By.linkText("Sign in")); 
		signInElement.click();
		
		WebElement userNameEl = driver.findElement(By.cssSelector("input#login1"));
		userNameEl.sendKeys("This is my userName");
		
		WebElement passWordEle = driver.findElement(By.xpath("//input[@name='passwd']"));
		passWordEle.sendKeys("This is my pass");
		
		WebElement goKeyEle = driver.findElement(By.cssSelector("input[name='proceed']"));
		goKeyEle.click();
		
		
	}

}
