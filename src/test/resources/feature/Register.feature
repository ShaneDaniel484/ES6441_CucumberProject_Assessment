Feature: Register an account in Demo.opencart


Scenario: Register account and Get Successful message.

Given User lands in Opencart HomePage
When User clicks Register link
And User enters Genter,Firstname,Lastname,E-Mail,Password and CPassword
		|gender|firstname|lastname|email            |password|Cpassword|
		|Male|shane      |daniel     |sd@gmail.com|123456@ |123456@   |
And User click register button
Then User get successfully registerd message and log out