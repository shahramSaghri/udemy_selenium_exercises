import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.getProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http:/google.com");
		
		String title = driver.getTitle();
		
		System.out.println(title);

	}

}
