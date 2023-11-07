Feature: login to the opencart website

@valid_credentials
Scenario: login using valid credentials
Given user is on login page
And user clicks login link
When user enters email
And user enters password
And user clicks login button
Then user is logged in


@invalid_credentials
Scenario: login using invalid credentials
Given user is on login page
When user clicks login link
And user enters invalid email
And user enters invalid password
And user clicks login button
Then user gets login unsuccessfull messege
