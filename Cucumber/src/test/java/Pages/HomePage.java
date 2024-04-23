package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BasePage;
import Base.BaseTest;

public class HomePage extends BasePage {
	static WebDriver driver;
    public HomePage() {
   	 super(driver=BaseTest.getDriver("Chrome"));
		/*comingfrom LoginPage:
   	    addObject("Username",By.id("username"));
		addObject("Password",By.id("password"));		
		addObject("Login", By.id("Login"));		
		 */
   	 
		addObject("HomeTab",By.xpath("//a[@title='Home Tab']"));
		addObject("Nav-Label",By.id("userNavLabel"));
		addObject("Logout",By.xpath("//a[@title='Logout']"));
		addObject("MyProfile",By.xpath("//a[@title='My Profile']"));
		addObject("EditProfile",By.xpath("//img[@title='Edit Profile']"));
	    addObject("iframeEditContact",By.id("contactInfoContentId"));
        addObject("About",By.id("aboutTab"));
        addObject("Lastname",By.id("lastName"));
	    addObject("SaveAll",By.xpath("//input[@value='Save All']"));
	    addObject("Post", By.xpath("//span[contains(@class,'publisherattachtext') and text()='Post']"));
	    addObject("iframePostBox", By.xpath("//iframe[@title='Rich Text Editor, publisherRichTextEditor']"));
	    addObject("PostBox",By.xpath("//body[@spellcheck='true']"));
	    addObject("Share", By.xpath("//input[@id='publishersharebutton']"));
	    addObject("File", By.xpath("//span[@class='publisherattachtext ' and contains(text(),'File')]"));
	    addObject("Upload a file from your computer",By.xpath("//a[@id='chatterUploadFileAction']"));
	    addObject("choose file",By.xpath("//input[@id='chatterFile']"));
	    addObject("hoverPhoto",By.id("photoSection"));
	    addObject("updatePhoto",By.id("uploadLink"));
	    addObject("iframePhotoupload", By.id("uploadPhotoContentId"));
	    addObject("choose photo", By.xpath("//input[@id='j_id0:uploadFileForm:uploadInputFile'][1]"));
	    addObject("photoSave",By.id("j_id0:uploadFileForm:uploadBtn"));
	    addObject("cropPhotoSave", By.xpath("//input[@class=\"btn saveButton\"]"));
	    addObject("My Settings",By.xpath("//a[@title='My Settings']"));
	    addObject("Personal",By.id("PersonalInfo_font"));
	    addObject("LoginHistory", By.xpath("//span[contains(text(),'Login History')]"));
	    addObject("DisplayLayout",By.id("DisplayAndLayout_font"));
	    addObject("CustomizeTabs",By.xpath("//span[@id='CustomizeTabs_font' and contains(text(),'Customize My Tabs')]"));
	    addObject("CustomApp", By.xpath("//select[@name='p4']"));
	    addObject("AvailableTabs", By.xpath("//select[@name='duel_select_0' and @id='duel_select_0']"));
	    addObject("Add",By.xpath("//img[@alt='Add']"));
	    addObject("Email", By.id("EmailSetup_font"));
	    addObject("myEmailSettings", By.id("EmailSettings_font"));
	    addObject("Sendername", By.xpath("//input[@id='sender_name' and @name='sender_name']"));
	    addObject("SenderEmail",By.xpath("//input[@id='sender_email' and @name='sender_email']"));
	    addObject("Bcc", By.xpath("//input[@id='auto_bcc1']"));
	    addObject("SaveEmail", By.xpath("//input[@type='submit' and @name='save']"));
	    addObject("CalendarReminders",By.id("CalendarAndReminders_font"));
	    addObject("ActivityReminders",By.xpath("//span[@class='leafText' and contains(text(),'Activity Reminders')]"));
	    addObject("TestReminder", By.id("testbtn"));
	    addObject("Developer Console", By.xpath("//a[@title='Developer Console (New Window)']"));
	    addObject("Logout",By.xpath("//a[@title='Logout']"));	   
	    	    
    }
	
}
