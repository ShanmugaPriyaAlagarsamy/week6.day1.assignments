Feature: Login functionality of Leaftaps application
#Background: 
#Given Open the chrome browser
#And Load the application url
@functional 
Scenario Outline: TC001_Login application with postitive credential
Given Enter the username as <username>
And Enter the password as <password>
When Click on login button
Then Homepage should be displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
#|'DemoCSR'|'crmsfa'|

@functional @regression
Scenario: TC002_Login application with negative credential

And Enter the username as 'Demo'
And Enter the password as 'crmsfa'
When Click on login button
But Error message should be displayed