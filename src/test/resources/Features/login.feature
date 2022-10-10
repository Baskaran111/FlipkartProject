Feature: Validate the login page

@smoketesting
Scenario: Validate the login with the valid credentials
Given  User is on the login page
When   User enters the valid username and password
And    User clicks the login button
Then   User is on the home page

@smoketesting
Scenario: Validate the login with the invalid credentials
Given  User is on the login page
When   User enters the invalid username and invalid password
And    User clicks the login button
Then   User is on the home page

@sanityTesting
Scenario: Validate the login with the invalid username and valid password
Given  User is on the login page
When   User enters the valid invalid username and valid password
And    User clicks the login button
Then   User is on the home page

@RegressionTesting
Scenario: Validate the login with the valid username and invalid password
Given  User is on the login page
When   User enters the valid valid username and invalid password
And    User clicks the login button
Then   User is on the home page
