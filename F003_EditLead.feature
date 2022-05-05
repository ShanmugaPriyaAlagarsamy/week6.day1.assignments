Feature: Edit Lead functionality of Leaftaps application

Scenario Outline: TC_004 To Edit the existing lead details 

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
When Click on Edit button
Then Edit Lead page is displayed
Given Enter description
And Enter Important note
When Click submit button
Then Lead page is opened with updated details

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|

