Feature: Verify Automation Practice

Background: 
Given User lanuch the application

Scenario Outline: Verify Product Count

When User Click on the tab "<tab>"
Then User should see the same number of products count matching with the product header count displayed

Examples:
|tab|
|DRESSES|
|WOMEN|
|TSHIRTS|

@Regression
Scenario Outline: Verify Product Count

When User Click on the tab "<tab>"
And the click on Add to cart button for the product "<products>"
Then the product should added to cart page

Examples:

|tab|products|
|DRESSES|Printed Chiffon Dress|
|DRESSES|Printed Summer Dress|
 