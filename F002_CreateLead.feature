Feature: Create Lead function of Leaftaps application

@functional @smoke
Scenario Outline: TC003_ Click on CRMSFA link to go to create lead

Given Enter the username as <username>
And Enter the password as <password>
When Click on login button
Then Homepage should be displayed
When Click on CRMSFA link 
Then opens Leaftaps main page to create lead
When Click on Create Lead button
Then opens Create Lead page
Given Enter the Company name as "Tata Consultancy Services"
And Enter the First name as "Shanmug"
And Enter the Last name as "Priya"
When Click on submit button
Then Lead is created successfully
Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
# |'DemoCSR'|'crmsfa'|
