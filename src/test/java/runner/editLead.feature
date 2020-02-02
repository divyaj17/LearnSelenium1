Feature: EditLead for Leaftaps Application

Scenario: TC001_Positive_EditLead
And Click on the Find Lead Menu
And Enter the First Name as Selvi
And Click Find Leads
And Click the first result
And Click Edit lead
And Enter the updated Company Name as Hero
When Click the update button
Then Verify Lead Updation is success

#Examples:
#|firstName|companyName|
#|Swathi|Flipkart|
#|Geetha|Flipkart|
#|Vishnu|Flipkart|
