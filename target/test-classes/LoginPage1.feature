#Feature file

Feature: Validation of facebook details

Scenario: validate the login details.
Given user is on facebook page.
When user enter username and passwords
#2D with header
|name|userName|password|
|bala|bala@gmail.com|bala123|
|ravi|ravi@gmail.com|ravi123|
|ramu|ramu@gmail.com|ramu123|
And user click the login button and message displayed.
Then verify success message is displayed
