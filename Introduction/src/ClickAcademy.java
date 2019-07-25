import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAcademy {

	public static void main(String[] args) {
		// TODO Auto-generated method stu

		System.getProperty("webdriver.chrome.driver", 
				"/Documents/Udemy/Selenium-WebDriver-with-Java-Basic-to-advance/browser-exe-files/chrome/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/interview.php");
//		
//		WebElement seleniumTab = driver.findElement(By.xpath("//li[text() = ' Selenium ']"));
//		seleniumTab.click();
//		
//		driver.get("http://www.qaclickacademy.com/interview.php");
//		
//		WebElement seleniumTabBySiblings = driver.findElement(By.xpath("//ul[@class='responsive-tabs__list/li/following::li[2]']"));
//		seleniumTabBySiblings.click();
//		
//		driver.get("http://www.qaclickacademy.com/interview.php");
		
		WebElement seleniumTabByChild = driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul"));
		
		
		System.out.println(seleniumTabByChild.getAttribute("role"));
		
		

	}

}
