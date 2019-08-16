Feature: new user registration

Scenario: add new user

Given I am in the homepage
When I enter user information
And enter submit
Then I receive a successful registration message