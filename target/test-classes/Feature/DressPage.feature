Feature: Verify Automation Practice

Scenario Outline: Verify Product Count

Given User lanuch the application
When User Click on the tab "<tab>"
Then User should see the same number of products count matching with the product header count displayed

Examples:
|tab|
|DRESSES|

@Regression
Scenario Outline: Verify Product Count

Given User lanuch the application
When User Click on the tab "<tab>"
And the click on Add to cart button for the product "<products>"
Then the product should added to cart page

Examples:

|tab|products|
|DRESSES|Printed Chiffon Dress|
