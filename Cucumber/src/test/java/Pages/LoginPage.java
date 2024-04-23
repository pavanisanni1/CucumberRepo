package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BasePage;
import Base.BaseTest;

public class LoginPage extends BasePage{
static WebDriver driver;
     public LoginPage() {
    	 super(driver=BaseTest.getDriver("Chrome"));
		addObject("Username",By.id("username"));
		addObject("Password",By.id("password"));
		addObject("Login", By.id("Login"));
		addObject("rememberme",By.xpath("//input[@class='r4 fl mr8']"));
		addObject("forgotpassword",By.id("forgot_password_link"));
	    addObject("Error",By.xpath("//div[@id='error']"));
     }
	
}
