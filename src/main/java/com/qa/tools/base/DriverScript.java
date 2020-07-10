package com.qa.tools.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DriverScript {
	
	public static  Properties prop;
	public static WebDriver driver;
	
	public DriverScript() {
		 try {
			 
			  File src = new File("C:\\Users\\Win7\\git\\pomprojectlearning\\POMConfiguration\\Config.properties");
			  FileInputStream fis = new FileInputStream(src);
			 prop = new Properties();
			 prop.load(fis); 
			 
		 }
		 catch(Exception e) {
			 System.out.println("unable to load property file" + e.getMessage());
		 }
		 
			
	}
	        
	public static void qatools()
	{
		String browser = prop.getProperty("browser");
		
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\Win7\\git\\pomprojectlearning\\POMBrowsers\\chromedriver.exe" );
		driver = new ChromeDriver();*/
		
	
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Win7\\git\\pomprojectlearning\\POMBrowsers\\chromedriver.exe" );
			driver = new ChromeDriver();
		
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.geicko.driver", "C:\\Users\\Win7\\git\\pomprojectlearning\\POMBrowsers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		//driver.get("https://www.toolsqa.com/selenium-tutorial/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		String  url = prop.getProperty("url");
		driver.get(url);
		
	
		
		
	}	
}	
		
		
		

		
		
		
		
		
		
		
		
		
		

	
	
	
	
	
	
	
	
	
	

