#Feature file
Feature: Validation of facebook details
@Reg
Scenario Outline: validate the login details.
Given User is on facebook pages
When user enter "<userName>"username and "<passWord>"password
And user click the login button and message displayed.
Then verify success message is displayed
Examples:
|userName|passWord|
|test1@gmail.com|234234234|
|test2@gmail.com|789873423|



