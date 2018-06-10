Feature: Create Lead funtionality in leaftaps

Scenario Outline: Create lead functionality
And Enter Username as <userName>
And Enter Password as <password>
And Click on login button
And Click on CRMSFA link
And Click on Leads tab
And Click on Create Lead link
And Enter Company Name as <companyName>
And Enter First Name as <firstName>
And Enter Last Name as <lastName>
When Click on Create Lead Button
Examples:
|userName|password|companyName|firstName|lastName|
|DemoSalesManager|crmsfa|HCL|ArunKumar|Rajendar|
|DemoSalesManager|crmsfa|TCS|Palanivel|Palaniyappan|

