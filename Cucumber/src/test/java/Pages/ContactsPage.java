package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BasePage;
import Base.BaseTest;

public class ContactsPage extends BasePage{
	static WebDriver driver;
	public ContactsPage() {
		
		super(driver=BaseTest.getDriver("Chrome"));	
		
		/*comingfrom LoginPage:
	    addObject("Usersname",By.id("username"));
	addObject("Password",By.id("password"));		
	addObject("Login", By.id("Login"));		
	 */
		
		addObject("ContactsTab",By.xpath("//a[@title='Contacts Tab']"));
		addObject("newBtn",By.xpath("//input[@name='new']"));
		addObject("lastname",By.xpath("//input[@name='name_lastcon2']"));
		addObject("accountname",By.xpath("//input[@name='con4']"));
		addObject("saveBtn",By.xpath("//input[@class='btn']"));
		addObject("newView",By.xpath("//a[contains(text(),'Create New View')]"));
		addObject("viewname",By.xpath("//input[@id='fname']"));
		addObject("uniquename",By.xpath("//input[@id='devname']"));
		addObject("createBtn",By.xpath("//input[@class='btn primary' and @data-uidsfdc='3']"));
		addObject("selectRecentlycreated",By.id("hotlist_mode"));
		addObject("selectMycontactsView",By.xpath("//select[@title='View:']"));
		addObject("recentlyCreatedcontact",By.xpath("(//a[contains(text(),'ABCDcontactname')])[1]"));
		addObject("cancelBtn",By.xpath("(//input[@title='Cancel'])[1]"));
		addObject("savenewBtn",By.xpath("(//input[@title='Save & New'])[1]"));
	}	
}
