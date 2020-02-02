Feature: Lead for Leaftaps Application
Background:
Given Launch the Browser
And Load the URL
And Maximise the Browser
And Set the Timeouts
And Enter Username as Demosalesmanager
And Enter Password as crmsfa
When Click on the Login Button
Given Click CRMSFA Link
And Click on the Leads Tab

Scenario: TC001_Positive_CreateLead_Flow
And Click on the Create Lead Menu
And Enter the Company Name as TCS
And Enter the First Name as Divi
And Enter the Last Name as J
When Click on the Create Lead Button
Then Verify Lead Creation is success

Scenario Outline: TC002_CreateLead_DynamicData
And Click on the Create Lead Menu
And Enter the Company Name as <companyName>
And Enter the First Name as <firstName>
And Enter the Last Name as <lastName>
When Click on the Create Lead Button
Then Verify Lead Creation is success

Examples:
|companyName|firstName|lastName|
|Astrazenica|Deepi|Ram|
|Hurix|Lakshmi|A|

Scenario: TC001_Positive_EditLead
And Click on the Find Lead Menu
And Enter the F Name as Deepi
And Click Find Leads
And Click the first result
And Click Edit lead
And Enter the updated Company Name as Hero
When Click the update button
Then Verify Lead Updation is success


