Feature: Salesforce Application 

@TC-login
Scenario: User should login with valid username and password
Given user launchs the application in "Chrome"
Given user is on "LoginPage"
#Then User waits for Element "Username"
Then user enters into the textbox "Username" "pavani@lta.com"
Then user enters into the textbox "Password" "password123"
Then Click on the button "Login"

@TC1
Scenario: Clear Password field
Given user launchs the application in "Chrome"
Given user is on "LoginPage"
Then user enters into the textbox "Username" "pavani@lta.com"
Then user enters into the textbox "Password" ""
Then Click on the button "Login"

@TC2
#execute @TC-login or @TC2
Scenario: User is in homepage
Given user is on "HomePage"
#Then User waits for Element "HomeTab"
Then Click on the button "HomeTab"

@TC3
Scenario: Username should be remembered
Given user launchs the application in "Chrome"
Given user is on "LoginPage"
Then user enters into the textbox "Username" "pavani@lta.com"
Then user enters into the textbox "Password" "password123"
Then user checks "rememberme" checkbox
Then Click on the button "Login"
Given user is on "HomePage"
Then Click on the link "Nav-Label" 
Then Click on the link "Logout"

@TC4A
Scenario: Check forgot password checkbox
Given user launchs the application in "Chrome"
Given user is on "LoginPage"
Then Click on the link "forgotpassword"

@TC4B
Scenario: Wrong password
Given user launchs the application in "Chrome"
Given user is on "LoginPage"
Then user enters into the textbox "Username" "pavani@lta.com"
Then user enters into the textbox "Password" "123"
Then Click on the button "Login"

@TC5
Scenario: User menu dropdown
Given user launchs the application in "Chrome"
Given user is on "LoginPage"
Then user enters into the textbox "Username" "pavani@lta.com"
Then user enters into the textbox "Password" "password123"
Then Click on the button "Login"
Given user is on "HomePage"
Then Click on the link "Nav-Label" 

@TC6
Scenario: Edit contact information
#Execute @TC5 or @TC6
Given user is on "HomePage"
Then Click on the link "MyProfile"
Then Click on the EditProfileLink "EditProfile"
Then Switch to frame with_Title "iframeEditContact"
Then Click on the button "About"
Then user enters into the textbox "Lastname" "Changed-2"
Then Click on the button "SaveAll"
Then close frame return to the main window

Then Click on the link "Post"
Then User waits for Element "iframePostBox"
Then Switch to frame with_Title "iframePostBox"
Then user enters into the textbox "PostBox" "testing testing in cucumber"
Then close frame return to the main window
Then Click on the button "Share"

Then Click on the link "File" 
Then User waits for Element "Upload a file from your computer"
Then Click on the button "Upload a file from your computer"
########Then pass the file address to the "choose file" button#######
Then user enters into the textbox "choose file" "c:\test2.txt"
Then Click on the button "Share"

Then Click on the link "hoverPhoto" to update
Then User waits for Element "updatePhoto"
####Then Click on the link "update" to update the photo######
Then Click on the link "updatePhoto" to update
Then User waits for Element "iframePhotoupload"
Then Switch to frame with_Title "iframePhotoupload"
####Then pass the photo address to the "choose file" button#######
Then user enters into the textbox "choose photo" "c:\cat.jpg"
Then Click on the button "photoSave"
#Then Click on the button "cropPhotoSave"

@TC7
Scenario: My Settings
#Execute @TC5 or @TC7
Given user is on "HomePage"
Then Click on the link "My Settings"
Then User waits for Element "Personal"
Then Click on the link "Personal"
Then Click on the link "LoginHistory"
Then Click on the link "DisplayLayout"
Then Click on the link "CustomizeTabs"
###select from drop down#####
Then Click on the link "CustomApp"
Then Select item "CustomApp" "Salesforce Chatter"
Then Select item "AvailableTabs" "Reports"
Then Click on the button "Add"
Then Click on the link "Email"
Then Click on the link "myEmailSettings"
Then user enters into the textbox "Sendername" "pavaniabc"
Then user enters into the textbox "SenderEmail" "pavani@lta.com"
###click on radio button###
Then Click on the button "Bcc"
Then Click on the button "SaveEmail"
Then Accept Alert
Then Click on the link "CalendarReminders"
Then Click on the link "ActivityReminders"
Then Click on the button "TestReminder"

@TC8
Scenario: Developer Console
#Execute @TC5 or @TC8
Given user is on "HomePage"
Then Click on the link "Developer Console"
Then Close the window

@TC9
Scenario: Logout
#Execute @TC5 or @TC9
Given user is on "HomePage"
Then Click on the link "Logout"

@TC10
Scenario: Accounts Page
#Execute @TC5 or @TC10
Given user is on "AccountPage" 
Then Click on the link "AccountsTab"
Then Click on the link "NewAccount"
Then user enters into the textbox "NewAccName" "Account_changed"
Then Select item "techType" "Technology Partner"
Then Select item "priority" "High"
Then Click on the button "AccSave"

@TC11
#Execute @TC5 or @TC11
Scenario: New View
Given user is on "AccountPage" 
Then Click on the link "AccountsTab"
Then Click on the link "CreateNewView"
Then user enters into the textbox "ViewName" "NewViewName1"
Then user enters into the textbox "UniqueViewName" "New_View_Name1"
Then Click on the button "ViewSave"

@TC12
#Execute @TC5 or @TC12
Scenario: Edit View
Given user is on "AccountPage" 
Then Click on the link "AccountsTab"
Then Select item "ViewEdit" "NewViewName1"
Then Click on the button "EditView"
Then user enters into the textbox "ViewChange" "New_View_Change"
Then Select item "Fields" "Account Name"
Then Select item "Operators" "contains"
Then user enters into the textbox "Value" "4/17/24"
Then Click on the link "AvailableFields"
Then Click on the link "AddField"
Then Click on the button "SaveBtn"

@TC13
#Execute @TC5 or @TC13
Scenario: Accounts merge
Given user is on "AccountPage" 
Then Click on the link "AccountsTab"
Then Click on the link "MergeAccounts"
Then user enters into the textbox "SearchLetter" "*.a"
Then Click on the button "FindAccounts"
#Click on the check box
Then Click on the button "Account1"
Then Click on the button "Account2"
Then Click on the button "NextBtn"
Then Click on the button "Merge"
Then Accept Alert
Then Select item "views" "Recently Viewed"

@TC14
#Execute @TC5 or @TC14
Scenario: Create Account Report
Given user is on "AccountPage" 
Then Click on the link "AccountsTab"
Then Click on the link "lastActivity"
Then Click on the link "dateField"
Then Click on the link "createdDate"
Then Click on the link "datePicker"
Then Click on the link "todayDate"
Then user enters into the textbox "endDate" ""
Then Click on the link "sideClick"
Then user enters into the textbox "endDate" "04/17/2024"
Then Click on the link "btn"
Then Click on the link "sideClick"
Then Click on the link "saveBtn2"
Then user enters into the textbox "reportName" "Report abcxyz"
#Then user enters into the textbox "uniqueName" ""
#Then user enters into the textbox "uniqueName" "Report_abc"
Then User waits for Element "saveRun"
#Then Click on the button "saveRun"
Then Click on the button "saveRun"

@TC15
Scenario: Opportunities dropdown
#execute @TC5 or #TC15, given user is on opportunity page means we are on OpportunityPage java file
Given user is on "OpportunityPage"
#check dropdown
Then Click on the link "OpportunitiesTab"
Then Click on the link "selectOpp"
Then Verify "selectOpp" 

@TC16
Scenario: New Opportunity
#execute @TC5 or #TC16, given user is on opportunity page means we are on OpportunityPage java file
Given user is on "OpportunityPage"
Then Click on the link "OpportunitiesTab"
Then Click on the button "newBtn"
Then user enters into the textbox "oppName" "New_Opportunityabc"
Then user enters into the textbox "accName" "Account_changed"
Then Click on the button "closeDate"
Then Click on the button "selectToday"
Then Select item "stages" "Needs Analysis"
Then user enters into the textbox "probability" "0"
Then Select item "source" "Partner Referral"
Then user enters into the textbox "campainSource" "DM Campaign to Top Customers - Nov 12-23, 2001"
Then Click on the button "oppSave"

@TC17
Scenario: Opportunity Pipeline
#execute @TC5 or #TC17, given user is on opportunity page means we are on OpportunityPage java file
Given user is on "OpportunityPage"
Then Click on the link "OpportunitiesTab"
Then Click on the link "opportunityPipeline"

@TC18
Scenario: Stuck Opportunity
#execute @TC5 or #TC18, given user is on opportunity page means we are on OpportunityPage java file
Given user is on "OpportunityPage"
Then Click on the link "OpportunitiesTab"
Then Click on the link "stuckOpportunities"

@TC19
Scenario: Quarterly summary
#execute @TC5 or #TC19, given user is on opportunity page means we are on OpportunityPage java file
Given user is on "OpportunityPage"
Then Click on the link "OpportunitiesTab"
Then Select item "interval" "Next FQ"
Then Select item "include" "Open Opportunities"
Then Click on the button "runReport"

@TC20
Scenario: Lead tab
#execute @TC5 or #TC20, given user is on lead page means we are on LeadPage java file
Given user is on "LeadPage"
Then Click on the link "LeadsTab"

@TC21
Scenario: Lead selectview
#execute @TC5 or #TC21, given user is on lead page means we are on LeadPage java file
Given user is on "LeadPage"
Then Click on the link "LeadsTab"
Then Click on the link "leadsSelect"

@TC22
Scenario: Lead selectview
#execute @TC5 or #TC22, given user is on lead page means we are on LeadPage java file
Given user is on "LeadPage"
Then Click on the link "LeadsTab"
Then Click on the link "leadsSelect"
Then Select item "leadsSelect" "My Unread Leads"
Given user is on "HomePage"
Then Click on the link "Nav-Label" 
Then Click on the link "Logout"
Given user launchs the application in "Chrome"
Given user is on "LoginPage"
Then User waits for Element "Username"
Then user enters into the textbox "Username" "pavani@lta.com"
Then user enters into the textbox "Password" "password123"
Then Click on the button "Login"
Given user is on "LeadPage"
Then Click on the link "LeadsTab"
Then Click on the button "goBtn"

@TC23
Scenario: Lead select-Todays Leads
#execute @TC5 or #TC23, given user is on lead page means we are on LeadPage java file
Given user is on "LeadPage"
Then Click on the link "LeadsTab"
Then Click on the link "leadsSelect"
Then Select item "leadsSelect" "Today's Leads"

@TC24
Scenario: Lead select-Todays Leads
#execute @TC5 or #TC24, given user is on lead page means we are on LeadPage java file
Given user is on "LeadPage"
Then Click on the link "LeadsTab"
Then Click on the button "newBtn"
Then user enters into the textbox "lastname" "ABCDLastname"
Then user enters into the textbox "companyname" "ABCDCompany"
Then Click on the button "saveBtn"

@TC25
Scenario: Create new contact
#execute @TC5 or #TC25, given user is on contacts page means we are on ContactsPage java file
Given user is on "ContactsPage"
Then Click on the link "ContactsTab"
Then Click on the button "newBtn"
Then user enters into the textbox "lastname" "ABCDcontactname"
Then user enters into the textbox "accountname" "Account_changed"
Then Click on the button "saveBtn"

@TC26
Scenario: Create new contact-view
#execute @TC5 or #TC26, given user is on contacts page means we are on ContactsPage java file
Given user is on "ContactsPage"
Then Click on the link "ContactsTab"
Then Click on the link "newView"
Then user enters into the textbox "viewname" "ABCDview"
Then user enters into the textbox "uniquename" "ABCDview"
Then Click on the button "createBtn"

@TC27
Scenario: check recently created contact
#execute @TC5 or #TC27, given user is on contacts page means we are on ContactsPage java file
Given user is on "ContactsPage"
Then Click on the link "ContactsTab"
Then Select item "selectRecentlycreated" "Recently Created"

@TC28
Scenario: my contacts
#execute @TC5 or #TC28, given user is on contacts page means we are on ContactsPage java file
Given user is on "ContactsPage"
Then Click on the link "ContactsTab"
Then Select item "selectMycontactsView" "My Contacts"

@TC29
Scenario: click on contact name
#execute @TC5 or #TC29, given user is on contacts page means we are on ContactsPage java file
Given user is on "ContactsPage"
Then Click on the link "ContactsTab"
Then Click on the link "recentlyCreatedcontact"

@TC30
Scenario: create new view
#execute @TC5 or #TC30, given user is on contacts page means we are on ContactsPage java file
Given user is on "ContactsPage"
Then Click on the link "ContactsTab"
Then Click on the link "newView"
Then user enters into the textbox "uniquename" "ABCDNewview"
Then Click on the button "createBtn"

@TC31
Scenario: create new view is cancelled
#execute @TC5 or #TC31, given user is on contacts page means we are on ContactsPage java file
Given user is on "ContactsPage"
Then Click on the link "ContactsTab"
Then Click on the link "newView"
Then user enters into the textbox "viewname" "ABCDNewview"
Then user enters into the textbox "uniquename" "ABCD_Newview"
Then Click on the button "cancelBtn"

@TC32
Scenario: save and new buttons in contact page
#execute @TC5 or #TC32, given user is on contacts page means we are on ContactsPage java file
Given user is on "ContactsPage"
Then Click on the link "ContactsTab"
Then Click on the button "newBtn"
Then user enters into the textbox "lastname" "Indian3"
Then user enters into the textbox "accountname" "TestingAccount"
Then Click on the button "savenewBtn"

@TC33
Scenario: Verify first and last name is displayed
#execute @TC5 or #TC33, given user is on Random page means we are on RandomPage java file
Given user is on "RandomPage"
Then Click on the link "homeTab"
Then Get username "username"
Then Click on the link "username"

@TC34
Scenario: Edit lastname
#execute @TC5 or #TC34, given user is on Random page means we are on RandomPage java file
Given user is on "RandomPage"
Then Click on the link "homeTab"
Then Get username "username"
Then Click on the link "username"
Then Click on the link "edituser"
Then Switch to frame with_Title "iframeEditContact"
Then Click on the button "About"
Then user enters into the textbox "Lastname" "Changed-3"
Then Click on the button "SaveAll"
Then close frame return to the main window

@TC35
Scenario: Edit lastname
#execute @TC5 or #TC35, given user is on Random page means we are on RandomPage java file
Given user is on "RandomPage"
Then Click on the link "homeTab"
Then Click on the button "+"
Then Click on the link "customizetabs"
Then Select item "selectLibraries" "Libraries"
Then Click on the button "removeBtn"
Then Click on the button "saveBtn"

@TC36
Scenario: Block event calendar
#execute @TC5 or #TC36, given user is on Random page means we are on RandomPage java file
Given user is on "RandomPage"
Then Click on the link "homeTab"
Then Click on the link "dateLink"
Then Click on the link "event8"
Then Click on the link "subjectcombo"
Then switchTo childWindow
Then Click on the link "other"
Then switchBackTo parentWindow
Then Click on the link "endDate"
Then Click on the link "datePicker_8"
Then Click on the button "save"

@TC37
Scenario: Block an event with weekely recurrence
#execute @TC5 or #TC37, given user is on Random page means we are on RandomPage java file
Given user is on "RandomPage"
Then Click on the link "homeTab"
Then Click on the link "dateLink"
Then Click on the link "event4"
Then Click on the link "subjectcombo"
Then switchTo childWindow
Then Click on the link "other"
Then switchBackTo parentWindow
Then Click on the link "endDate"
Then Click on the link "datePicker_4"
Then Click on the link "checkRecurr"
Then user enters into the textbox "recurrendonly" ""
Then Click on the link "recurrendonly"
Then Click on the link "rightarrow"
Then Click on the link "date"
Then Click on the button "save"
Then Click on the link "monthview"

