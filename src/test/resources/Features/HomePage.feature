Feature: Validate the home page

Background:

Given User is now on the home page
When  User enters the username and password
Then  User is on the search page

Scenario: Validate the search page 

Given User is on the search bar
When  User searches for the mobile
Then  User is on th product detail page

Scenario: Validate the cart page 

Given User is on the cart page
When  User adds the item to the cart
Then  User is on the payment page


