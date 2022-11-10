@Release1.0 @Login
Feature: OrangHRM login page 

@SmokeTest @ValidCrendential
Scenario Outline: Login functionality test using valid credentials

Given user is in home page as 
When user is enter "<UserName>" and "<Password>"
Then user click login button
And user able to login the page 
Then user click admin name for logout page 
And user click logout botton 
Then user able to logout the page 


Examples:
|UserName|Password|
|Admin|admin123| 

@RegressionTest @InvalidCrendential
Scenario Outline: Login functionality test using Invalid credentials

Given user is in home page as 
When user is enter "<UserName>" and "<Password>"
Then user click login button
And user should see  massage "Invalid credentials"


Examples:
|UserName|Password|
|Admin|admin| 
|admin|admin1234|
|Adminn|admi123|

