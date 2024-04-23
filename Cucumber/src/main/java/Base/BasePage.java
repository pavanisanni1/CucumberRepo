package Base;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {
WebDriver driver;
HashMap<String,By> ObjectRepo=new HashMap<String, By>();

public BasePage(WebDriver driver) {
	this.driver=driver;
}

    public void addObject(String elementName,By by) {
    	System.out.println("------passing the address of the element for:"+elementName);
	    ObjectRepo.put(elementName,by);
    }

	public void enterIntoTextbox(String textboxName, String value) {		
		WebElement element=getElement(textboxName);
		if(element.getText()!=null)
			element.clear();
		
		element.sendKeys(value);
	}	
		
	public WebElement getElement(String elementName) {
		By by=ObjectRepo.get(elementName);
		WebElement element= driver.findElement(by);
		System.out.println("*******got the element@@@@@@@"+element.getAttribute("class"));
		return element;
	}
	
	public void clickonButton(String elementName){	
		System.out.println("^^^^^^^^^button : "+elementName);
		WebElement element=getElement(elementName);
	    System.out.println("^^^^^^^^^button name: "+element.getText());
		//System.out.println("++++++performing action on the element:"+element.getText());
	
		element.click();
	}
	
	public void waitforElement(String elementName) {
		WebElement element=getElement(elementName);
		WebDriverWait wait=new WebDriverWait(driver,5);
		System.out.println("_____waiting");
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void changeLastName(String lastname) {
		WebElement element=getElement(lastname);
		element.clear();
		element.sendKeys(lastname);
		
	}	

	public void validateText(String elementName, String expectedResult) {
		WebElement element=getElement(elementName);
		String ActualText=element.getText();
		System.out.println("!!!!!!!!!!!!!!!!!!"+element.getText());
		Assert.assertEquals(ActualText,expectedResult);
		
	}

	public void switchToFrameWithTitle(String frame) {
		System.out.println("************"+frame);
		WebElement element=getElement(frame);	
		//System.out.println("$$$$$$$$$$iframe:"+element.getAttribute("title"));
		driver.switchTo().frame(element);		
	}

	public void selectItem(String elementName, String value) {
		WebElement element=getElement(elementName);	
		Select options=new Select(element);
		options.selectByVisibleText(value);		
	}

	public void closeWindow() {
		try {
			String parentWindow=driver.getWindowHandle();
			Set<String> windows=driver.getWindowHandles();
			System.out.println("number of windows: "+windows.size());
			for(String window:windows) {
				if (!window.equals(parentWindow)){
					driver.switchTo().window(window);
					break;
				}
			}		
			driver.close();
			System.out.println("pass:i closed the console");
			}
			catch(Exception E) {
				System.out.println("couldn't close the console");
			}
		
	}

	public void verify(String elementName) {
		WebElement element=getElement(elementName);
		String str=element.getText();
		System.out.println(str);
		if (str.contains(
	              "All Opportunities Closing Next Month "
	              + "Closing This Month My Opportunities "
	              + "New Last Week New This Week Opportunity Pipeline Private"
	              + " Recently Viewed Opportunities Won") )
		{
			System.out.println("%%%%%True");
					}
		
	}

	public void getUsername(String elementName) {
		System.out.println("------getting username");
		WebElement element=getElement(elementName);
		String username=element.getText();
		System.out.println("------username: "+username);
		
	}
static String parentWindow;
	public void childWindow() {
		parentWindow=driver.getWindowHandle();
		String subWindow=null;
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it= handles.iterator();
		while(it.hasNext()) {
			subWindow=it.next();
		}
		driver.switchTo().window(subWindow);//switching to sub window
		
	}

	public void switchToparentWindow() {
		driver.switchTo().window(parentWindow);//switch back to parent window
		
	}
	
	
}
