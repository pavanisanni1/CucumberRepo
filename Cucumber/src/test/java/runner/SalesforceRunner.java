package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Workspace\\Cucumber\\Features\\Salesforce.feature",
                 glue = {"steps"},
                 tags="@TC5 or @TC37",
                 plugin= {"pretty", "html:target/cucumber-reports/cucumber.html",
                		 "json:target/cucumber-reports/cucumber.json"})

public class SalesforceRunner {

}
