Feature: Validation of flipkart details
Background:
Given user is on flipkart page.
Scenario Outline: Validate search Text box
When user enters "<Searchbox>" product name
Then user click search icon
Examples:
|Searchbox|
|iphone|

Scenario: Validate Cart icon
When user click cart button icon
Then user successfully login in cart.
