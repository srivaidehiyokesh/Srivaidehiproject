Feature: Creating a lead
Background:
Given open the browser
And maximize the window
And launch the url
And set the timeout
@sanity
Scenario: Creating an lead with mandatory fields
Given Enter the username as Demosalesmanager
And Enter the password as crmsfa
And click the login
And click the crmsfa
And click on createlead
And Enter the companyname as Wipro
And Enter the firstname as vaidehi
And Enter the lastname as Lakshmi
When click the create lead button
Then verify the created lead
@sanity
Scenario: Negative scenario
Given Enter the username as Demosalesmanager
And Enter the password as crmsfa1
When click the login
But login failed

#@smoke
#Scenario Outline: Creating an lead with mandatory fields
#Given open the browser
#And maximize the window
#And launch the url
#And set the timeout
#And Enter the username as Demosalesmanager
#And Enter the password as crmsfa
#And click the login
#And click the crmsfa
#And click on createlead
#And Enter the companyname as <cName>
#And Enter the firstname as <fName>
#And Enter the lastname as <lName>
#When click the create lead button
#Then verify the created lead
#
#Examples:
#|cName|fName|lName|
#|wipro|vaidehi|yogesh|
#|Cts|Lakshmi|vishnu|