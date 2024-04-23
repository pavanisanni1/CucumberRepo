package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import Base.BasePage;
import Base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.PageFactory;

public class Steps extends BaseTest {
BasePage page;
PageFactory pageFactory=new PageFactory();

@Given("user launchs the application in {string}")
public void user_launchs_the_application_in(String browser) {	
	launchApplication(browser);
}
@Given("user is on {string}")
public void user_is_on(String pageName) {
page=pageFactory.initialize(pageName);
}
@Then("user enters into the textbox {string} {string}")
public void user_enters_into_the_textbox(String textboxName, String value) {
    page.enterIntoTextbox(textboxName, value);
}
@Then("Click on the button {string}")
public void click_on_the_button(String elementName){	
	System.out.println("%%%%%%%%%% clicking on"+elementName);
	page.clickonButton(elementName);
    
}
@Then("User waits for Element {string}")
public void user_waits_for_element(String elementName) {
   page.waitforElement(elementName);
}
@Then("user checks {string} checkbox")
public void user_checks_checkbox(String element){	
    page.clickonButton(element);
}
@Then("Click on the link {string}")
public void click_on_the_link(String element){
	  page.clickonButton(element);
}
@Then("Click on the EditProfileLink {string}")
public void click_on_the_edit_profile_link(String element){
	page.clickonButton(element);	
}

@Then("user verifies the message {string} {string}")
public void user_verifies_the_message(String element, String expectedResult) {
    page.validateText(element,expectedResult);
}

@Then("close frame return to the main window")
public void close_frame_return_to_the_main_window() {
	 driver.switchTo().defaultContent();
}

@Then("Switch to frame with_Title {string}")
public void switch_to_frame_with_title(String frame) {	
	   page.switchToFrameWithTitle(frame);
}
@Then("Click on the link {string} to update")
public void click_on_the_link_to_update(String hoverPhoto) {
    page.clickonButton(hoverPhoto);
}

@Then("Select item {string} {string}")
public void select_item(String element, String value) {
   page.selectItem(element,value);
}

@Then("Close the window")
public void close_the_window() {
    page.closeWindow();
}

@Then("Accept Alert")
public void accept_alert() {
    driver.switchTo().alert().accept();
}
@Then("Verify {string}")
public void verify(String elementName) {
	page.verify(elementName);
}

@Then("Get username {string}")
public void get_username(String element) {
	 page.getUsername(element);
}

@Then("switchTo childWindow")
public void switch_to_child_window() {
page.childWindow();
}
@Then("switchBackTo parentWindow")
public void switch_back_to_parent_window() {
page.switchToparentWindow();
}

//to get screenshots
/*@After
public void teardown(Scenario scenario) {
	byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	scenario.attach(screenshot, "image/png", scenario.getName());
	driver.close();
	driver=null;
}
*/
}
