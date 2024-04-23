package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BasePage;
import Base.BaseTest;

public class LeadPage extends BasePage {
	
	static WebDriver driver;
	public LeadPage() {
		
		super(driver=BaseTest.getDriver("Chrome"));		
		
		/*comingfrom LoginPage:
		    addObject("Usersname",By.id("username"));
		addObject("Password",By.id("password"));		
		addObject("Login", By.id("Login"));		
		 */
		
		addObject("LeadsTab",By.xpath("//a[normalize-space()='Leads']"));
		addObject("leadsSelect",By.xpath("//select[@id='fcf']"));
		addObject("goBtn",By.xpath("//input[@title='Go!']"));
		addObject("newBtn",By.xpath("//input[@name='new']"));
		addObject("lastname",By.xpath("//input[@id='name_lastlea2']"));
		addObject("companyname",By.xpath("//input[@id='lea3']"));
		addObject("saveBtn",By.xpath("//td[@id='topButtonRow']//input[@title='Save']"));	
		
	}
	

}
