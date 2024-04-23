package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utilities.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
protected static WebDriver driver;

static PropertiesFile prop=new PropertiesFile();

	public static void launchApplication(String browser) {
		driver=getDriver(browser);			
		String applicationurl=prop.getProperty("url");		
		driver.get(applicationurl);
		
		
	}
		
		public static WebDriver getDriver(String browser) {
			if (driver==null) {
				if(browser.equalsIgnoreCase("Chrome")) {
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				}else if (browser.equalsIgnoreCase("Firefox")) {
					WebDriverManager.firefoxdriver().setup();
					driver=new FirefoxDriver();
				}else if(browser.equalsIgnoreCase("Edge")) {
					WebDriverManager.edgedriver().setup();
					driver=new EdgeDriver();
				}
				
			}
			return driver;
		}
}
