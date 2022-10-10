Feature: Search functionality

Scenario Outline: Validate the search page
Given User is on the google home page
When  User searches for the "<mobiles>"
Then  User is on the mobile detail pages


Examples:
| mobiles |
| iphone  |
| redmi   |
| samsung |