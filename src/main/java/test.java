import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {
  @Test
	public static void url() {
		 WebDriver driver;

			System.setProperty("webdriver.chrome.driver","C:\\Users\\Win7\\git\\pomprojectlearning\\POMBrowsers\\chromedriver.exe" );
			driver = new ChromeDriver();
			
			
			 
			driver.manage().window();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("https://www.toolsqa.com/selenium-tutorial/");
		}
	}


