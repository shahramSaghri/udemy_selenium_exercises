import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.getProperty("webdriver.chrome.driver", 
				"Documents/Udemy/Selenium-WebDriver-with-Java-Basic-to-advance/browser-exe-files/chrome/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		//WebDriverWait waitForElement = new WebDriverWait(driver, 15);
		//waitForElement.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[name='ctl00$mainContent$ddl_Adult']")));
		WebElement passengersDropDown = driver.findElement(By.cssSelector("div[id='divpaxinfo']"));
		//Select s = new Select(passengersDropDown);
		//s.selectByValue("2");
		passengersDropDown.click();
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		WebElement pluseElement = driver.findElement(By.id("hrefIncAdt"));
		//pluseElement.click();
		
		for(int i = 1; i < 5; i++) {
			pluseElement.click();
		}
		
		WebElement doneButton = driver.findElement(By.id("btnclosepaxoption"));
		doneButton.click();
		

	}

}
