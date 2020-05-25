Feature: Login Validation

Scenario Outline: Successful Login with Valid Credentials

Given User has to launch the Application
When User enter the value "<username>" and "<password>" in Login Page

And User click on the login button
Then User should logged into the application

Examples:
|username|password|
|gowthambala|balaji18|