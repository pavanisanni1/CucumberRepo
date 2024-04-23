package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BasePage;
import Base.BaseTest;

public class RandomPage extends BasePage {
	static WebDriver driver;
	public RandomPage() {
		
		super(driver=BaseTest.getDriver("Chrome"));	
		
		/*comingfrom LoginPage:
	    addObject("Usersname",By.id("username"));
	addObject("Password",By.id("password"));		
	addObject("Login", By.id("Login"));		
	 */
		
		//addObject("usernav",By.xpath("userNavLabel"));
		addObject("homeTab",By.xpath("//a[contains(text(),'Home')]"));
		addObject("username",By.xpath("(//a[@href='/_ui/core/userprofile/UserProfilePage'][normalize-space()='Pavani Changed-2'])[1]"));
		addObject("edituser",By.xpath("//img[@title='Edit Profile']"));
		addObject("iframeEditContact",By.id("contactInfoContentId"));
		addObject("About",By.id("aboutTab"));
		addObject("Lastname",By.id("lastName"));
		addObject("SaveAll",By.xpath("//input[@value='Save All']"));
		addObject("+",By.xpath("//img[@title='All Tabs']"));
		addObject("customizetabs",By.xpath("//input[@value='Customize My Tabs']"));
		addObject("selectLibraries",By.id("duel_select_1"));
		addObject("removeBtn",By.xpath("//img[@title='Remove']"));
		addObject("saveBtn",By.xpath("//input[@name='save']"));
		addObject("dateLink",By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[2]/a"));
		addObject("event8",By.xpath("//a[normalize-space()='8:00 PM']"));
		addObject("subjectcombo",By.xpath("(//img[@title='Subject Combo (New Window)'])[1]"));
		addObject("other",By.xpath("//a[contains(text(),'Other')]"));
		addObject("endDate",By.xpath("//input[@id='EndDateTime_time']"));
		addObject("datePicker_8",By.xpath("//div[@id='timePickerItem_42']"));
		addObject("save",By.xpath("//input[@tabindex='14']"));
		addObject("event4",By.xpath("//a[normalize-space()='4:00 PM']"));
		addObject("datePicker_4",By.xpath("//div[@id='timePickerItem_38']"));
		addObject("checkRecurr",By.xpath("//input[@id='IsRecurrence']"));
		addObject("recurrendonly",By.xpath("//input[@id='RecurrenceEndDateOnly']"));
		addObject("rightarrow",By.xpath("//img[@alt='Next Month']"));
		addObject("date",By.xpath("//td[normalize-space()='22']"));
		addObject("monthview",By.xpath("//img[@alt='Month View']"));
		
		
		
		
	}
}
