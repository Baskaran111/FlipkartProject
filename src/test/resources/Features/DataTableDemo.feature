Feature: Validating the search page

Scenario: Validating the search functionality
Given User is on the facebook login page
When  User enters the fb username and password
| username      | password |
| abc@gmail.com | abc@123  |
| xyz@gmail.com | xyz@123  |
And   User clicks the fb login button
Then  User is on the facebook home page


