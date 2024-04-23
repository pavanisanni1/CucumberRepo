
Feature: Login to Salesforce Application

Scenario: User should login with valid username and password
Given user launchs the application in "Chrome"
Given user is on "LoginPage"
Then User waits for Element "Username"
Then user enters into the textbox "Username" "pavani@lta.com"
Then user enters into the textbox "Password" "123"
Then Click on the button "Login"
Then user verifies the message "Error" "Pavani-Please check your username and password. If you still can't log in, contact your Salesforce administrator."


