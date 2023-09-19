Feature:
Verify Send feature in gmail

@IntegrationTest
Scenario:
Verify credentials of login

Given user is Home_Page_In_Gmail

Then user clicks on compose button

Then user type the email address of a person who wants to recevie the mail 

Then user clicks the send button 

Then user should receive a sent message in the top

Then user Go and  checks the sent item of its gmail account and it should must visible from there


