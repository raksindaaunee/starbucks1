@test
Feature:osCommerce login functionality test
 
Scenario Outline: login homepage successfully
Given user need to go to login page
When user need to click on my account button
And need to put username <raksinda@gmail.com>
And also need to put password <123456> 
And user will able to click on sign in button
Then User will able to log in in that page

Examples:
|username          |password|
|raksinda@gmail.com|123456  |


