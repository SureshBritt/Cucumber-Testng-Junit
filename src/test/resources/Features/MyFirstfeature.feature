
Feature: My First feature

Background:My First BG
Given I Load the Application URL

@Smoke
Scenario: My First Scenario
Given I m on login page
When I Enter "username" as username
And I Enter "Password" as password
And  I Click on Submit
Then Login should be successful
And I need to be on Homepage


Scenario: My Second Scenario
Given I m on Search page
When I Enter "SearchKey" in Search Textbox
And  I Click on Search
Then Search results should be displayed


Scenario Outline: My First Scenario Outline
Given I m on login page
When I Enter "<Username>" as username
And I Enter "<Password>" as password
And  I Click on Submit
Then Login should be successful
And I need to be on Homepage
Examples:
|Username|Password|
|User1|Pwd1|
|User2|Pwd2|


Scenario: My  Scenario with datatables as maps
Given I m on Search page
Then following data should be there
|Table|value|
|Table1|value1|
|Table2|value2|


Scenario: My Scenario with datatables as lists
Given I m on Search page
Then following data should be displayed
|Table|
|Table1|
|Table2|




