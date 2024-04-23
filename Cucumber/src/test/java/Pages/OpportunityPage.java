package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BasePage;
import Base.BaseTest;

public class OpportunityPage extends BasePage{
   static WebDriver driver;
	public OpportunityPage() {
	super(driver=BaseTest.getDriver("Chrome"));
	
	/*comingfrom LoginPage:
	    addObject("Usersname",By.id("username"));
	addObject("Password",By.id("password"));		
	addObject("Login", By.id("Login"));		
	 */
	
	addObject("OpportunitiesTab",By.xpath("//a[@title='Opportunities Tab']"));
	addObject("selectOpp",By.xpath("//select[@id='fcf']"));
	addObject("newBtn",By.xpath("//input[@name='new']"));
	addObject("oppName",By.xpath("//input[@id='opp3']"));
	addObject("accName",By.xpath("//input[@id='opp4']"));
	addObject("closeDate",By.xpath("//input[@id='opp9']"));
	addObject("selectToday",By.xpath("//a[@class='calToday']"));
	addObject("stages",By.xpath("//select[@id='opp11']"));
	addObject("probability",By.xpath("//input[@id='opp12']"));
	addObject("source",By.xpath("//select[@id='opp6']"));
	addObject("campainSource",By.xpath("//input[@id='opp17']"));
	addObject("oppSave",By.xpath("//td[@id='topButtonRow']//input[@title='Save']"));
	addObject("opportunityPipeline",By.xpath("//a[contains(text(),'Opportunity Pipeline')]"));
	addObject("stuckOpportunities",By.xpath("//a[contains(text(),'Stuck Opportunities')]"));
	addObject("interval",By.xpath("//select[@id='quarter_q']"));
	addObject("include",By.xpath("//select[@id='open']"));
	addObject("runReport",By.xpath("//input [@value='Run Report']"));
	
	}
}
