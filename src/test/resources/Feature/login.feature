Feature: LogIn Action Test

Scenario Outline: Successful Login with Valid Credentials
Given User is on home page
When User enters "<userName>","<password>" and click the login  button
Then User should able to login successfully

Examples:
|userName|password|
|gowthambala|balaji18|
|Test|test123|
