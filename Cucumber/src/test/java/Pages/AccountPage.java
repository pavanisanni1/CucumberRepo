package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BasePage;
import Base.BaseTest;

public class AccountPage extends BasePage {
	static WebDriver driver;
	public AccountPage() {
		super(driver=BaseTest.getDriver("Chrome"));
		
		/*comingfrom LoginPage:
   	    addObject("Usersname",By.id("username"));
		addObject("Password",By.id("password"));		
		addObject("Login", By.id("Login"));		
		 */
		
		addObject("AccountsTab",By.xpath("//a[normalize-space()='Accounts']"));
		addObject("NewAccount", By.xpath("//input[@name='new']"));
		addObject("NewAccName",By.id("acc2"));
		addObject("techType",By.id("acc6"));
		addObject("priority",By.id("00Nbm00000055qI"));
		addObject("AccSave",By.xpath("//input[@tabindex='34']"));
		addObject("CreateNewView",By.xpath("//a[contains(text(),'Create New View')]"));
		addObject("ViewName",By.id("fname"));
		addObject("UniqueViewName",By.id("devname"));
		addObject("ViewSave",By.xpath("//input[@data-uidsfdc=\"3\"]"));
		addObject("ViewEdit",By.xpath("//select[@id='fcf']"));
		addObject("EditView",By.xpath("//a[normalize-space()='Edit']"));
		addObject("ViewChange",By.xpath("//input[@id='fname']"));
		addObject("Fields",By.xpath("//select[@id='fcol1']"));
		addObject("Operators",By.xpath("//select[@id='fop1']"));
		addObject("Value",By.xpath("//input[@id='fval1']"));
		addObject("AvailableFields",By.xpath("//option[@value='ACCOUNT.LAST_ACTIVITY']"));
		addObject("AddField",By.xpath("//a[@id='colselector_select_0_right']//img[@title='Add']"));
		addObject("SaveBtn",By.xpath("//input[@data-uidsfdc='5']"));
		addObject("MergeAccounts",By.xpath("//a[contains(text(),'Merge Accounts')]"));
		addObject("SearchLetter",By.xpath("//input[@id='srch']"));
		addObject("FindAccounts",By.xpath("//div[@class='pbWizardBody']//input[2]"));
		addObject("Account1",By.xpath("//input[@id='cid0']"));
		addObject("Account2",By.xpath("//input[@id='cid1']"));
		addObject("NextBtn",By.xpath("//div[@class='pbBottomButtons']//input[@title='Next']"));
		addObject("Merge",By.xpath("//div[@class='pbTopButtons']//input[@title='Merge']"));
		addObject("views", By.xpath("//select[@id='hotlist_mode']"));
		addObject("lastActivity", By.xpath("//a[normalize-space()='Accounts with last activity > 30 days']"));
		addObject("dateField",By.xpath("//img[@id='ext-gen148']"));
		addObject("createdDate",By.xpath("//div[contains(text(),'Created Date')]"));
		addObject("datePicker",By.xpath("//img[@id='ext-gen152']"));
		addObject("todayDate",By.xpath("//button[@id='ext-gen281']"));
		addObject("endDate",By.xpath("//input[@name='endDate']"));
		addObject("sideClick",By.xpath("//img[@id='ext-gen154']"));
		addObject("btn",By.xpath("//button[@id='ext-gen61']"));
		addObject("saveBtn2",By.xpath("//button[@id='ext-gen49']"));
		addObject("reportName",By.xpath("//input[@id='saveReportDlg_reportNameField']"));
		addObject("uniqueName",By.xpath("//input[@name='reportDevName']"));			
		addObject("saveRun",By.xpath("(//button[normalize-space()='Save and Run Report'])[1]"));
	}
}
